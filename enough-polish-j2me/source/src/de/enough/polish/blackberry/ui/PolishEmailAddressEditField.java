//#condition polish.usePolishGui && polish.blackberry

/*
 * Copyright (c) 2004 Robert Virkus / Enough Software
 *
 * This file is part of J2ME Polish.
 *
 * J2ME Polish is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * J2ME Polish is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Foobar; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Commercial licenses are also available, please
 * refer to the accompanying LICENSE.txt or visit
 * http://www.j2mepolish.org for details.
 */
package de.enough.polish.blackberry.ui;

import de.enough.polish.ui.Style;
import de.enough.polish.ui.StyleSheet;

import net.rim.device.api.ui.Graphics;
import net.rim.device.api.ui.component.EmailAddressEditField;

public class PolishEmailAddressEditField extends EmailAddressEditField implements PolishTextField{

	
	private boolean isFocused;
    public boolean processKeyEvents = true;
	private int fontColor;
		
	//#if polish.JavaPlatform >= BlackBerry/4.6
		private BackgroundWrapper backgroundWrapper;
	//#endif
	
	public PolishEmailAddressEditField(String label, String initialValue, int maxNumChars, long style) {
		super(label, initialValue, maxNumChars, style);
		
	}

	public void focusAdd( boolean draw ) {
        //System.out.println("EditField: focusAdd (" + getText() + ")");
        super.focusAdd( draw );
        this.isFocused = true;
}

	public void focusRemove() {
	        //System.out.println("EditField: focusRemove (" + getText() + ")");
	        super.focusRemove();
	        this.isFocused = false;
	}
	
	public void doLayout(int width, int height)
	{
		if (height < 0 || width < 0) {
			//#debug info
			System.out.println("ignoring invalid layout params: width=" + width + ", height=" + height );                
			return;
	    }
		layout(width, height);
	}
		
	public void paint( net.rim.device.api.ui.Graphics g ) {
		if (this.isFocused 
    		//#if polish.useFullScreen
    			&& !StyleSheet.currentScreen.isMenuOpened()
    		//#endif
		) {
			g.setColor( this.fontColor );
			super.paint( g );
		}
	}
	
	public void setFont(Font font, int textColor) {
		try {
			super.setFont( font.font );
		} catch (IllegalStateException e) {
			//#debug
			System.out.println("Layout error: " + e );
		}
		this.fontColor = textColor;
	}
	
	public void setFont(javax.microedition.lcdui.Font font, int textColor) {
		// never used anyhow, since javax.microedition.lcdui.Font is mapped to Font
	}
	
	public void setPaintPosition(int x, int y ) {
	    this.isFocused = true;
	    super.setPosition(x, y);
	}
	
	public int getInsertPositionOffset() {
		return getCursorPosition();
	}
	
	
	public void setStyle(Style style) {
		Font font = (Font)(Object)style.getFont();
		if (font == null) {
			font = Font.getDefaultFont();
		}
		try {
			super.setFont( font.font );
		} catch (IllegalStateException e) {
			//#debug error
			System.out.println("Layout error: " + e );
		}
		this.fontColor = style.getFontColor();
		//#if polish.JavaPlatform >= BlackBerry/4.6
			if (style.background != null) {
				if (this.backgroundWrapper == null) {
					this.backgroundWrapper = new BackgroundWrapper( style.background );
					try {
						setBackground(this.backgroundWrapper);
					} catch (Exception e) {
						//#debug error
						System.out.println("Unable to set background" + e);
					}
				} else {
					this.backgroundWrapper.setBackground(style.background);
				}
			}
		//#endif
	}
	
	//#if polish.JavaPlatform >= BlackBerry/6.0
	boolean needsCursorFix = false;
	boolean needsNavigationFix = false;
	
	protected void update(int arg0) {
		super.update(arg0);
		this.needsCursorFix = true;
	}

	protected void drawFocus(Graphics arg0, boolean arg1) {
		if(this.isFocused) {
			if(this.needsCursorFix) {
				setCursorPosition(getCursorPosition());
				this.needsCursorFix = false;
			}
			super.drawFocus(arg0, arg1);
		}
	}

	protected int moveFocus(int arg0, int arg1, int arg2) {
		int remaining  = super.moveFocus(arg0, arg1, arg2);
		this.needsNavigationFix = (remaining != 0);
		return remaining;
	}
	
	public boolean needsNavigationFix() {
		return this.needsNavigationFix;
	}
	//#endif
}
