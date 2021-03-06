/*
 * Created on 07-Jan-2008 at 3:29:11.
 * 
 * Copyright (c) 2005 Robert Virkus / Enough Software
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
 * along with J2ME Polish; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Commercial licenses are also available, please
 * refer to the accompanying LICENSE.txt or visit
 * http://www.j2mepolish.org for details.
 */
package de.enough.polish.descriptor;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import de.enough.polish.Attribute;
import de.enough.polish.Device;
import de.enough.polish.Environment;

/**
 * <p>Writes no JAD file.</p>
 *
 * <p>Copyright Enough Software 2007</p>
 * <pre>
 * history
 *        07-Jan-2008 - rob creation
 * </pre>
 * @author Robert Virkus, j2mepolish@enough.de
 */
public class NoneDescriptorCreator extends DescriptorCreator  {

	/**
	 * Creates a new instance
	 */
	public NoneDescriptorCreator() {
		super();
	}

	/**
	 * Creates a new descriptor file.
	 * 
	 * @param descriptorFile the file that should be created
	 * @param descriptorAttributes the attributes
	 * @param encoding the encoding, usually UTF-8
	 * @param device the target device
	 * @param locale the target locale
	 * @param env the evironment
	 * @throws IOException when the descriptor could not be saved
	 */
	public void createDescriptor(File descriptorFile, Attribute[] descriptorAttributes, String encoding, Device device, Locale locale, Environment env)
	throws IOException
	{
		// do nothing
	}

}
