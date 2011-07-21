//#condition polish.usePolishGui && polish.android
package de.enough.polish.android.lcdui;

/**
 * This interface is used by applications which need to receive
 * high-level events from the implementation. An application will
 * provide an implementation of a <code>CommandListener</code>
 * (typically by using
 * a nested class or an inner class) and will then provide the
 * instance to the <CODE>addCommand</CODE> method on a
 * <code>Displayable</code> in
 * order to receive high-level events on that screen.
 * 
 * <p>The specification does not require the platform to create several
 * threads for the event delivery.
 * Thus, if a <code>CommandListener</code> method does not return
 * or the return is
 * not delayed, the system may be blocked. So, there is the following note to
 * application developers:</p>
 * <UL>
 * <LI><em>the <code>CommandListener</code> method should return
 * immediately</em>.</LI>
 * </UL>
 * <HR>
 * 
 * 
 * @since MIDP 1.0
 */
public interface CommandListener
{
	/**
	 * Indicates that a command event has occurred on
	 * <code>Displayable d</code>.
	 * 
	 * @param c - a Command object identifying the command. This is either one of the applications have been added to Displayable with addCommand(Command) or is the implicit SELECT_COMMAND of List.
	 * @param d - the Displayable on which this event has occurred
	 */
	void commandAction( Command c, Canvas d);

}
