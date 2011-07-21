//#condition polish.javaplatform >= Android/2.0
// generated by de.enough.doc2java.Doc2Java (www.enough.de) on Tue Mar 24 10:34:27 EET 2009
package de.enough.polish.android.bluetooth;

/**
 * 
 * The <code>UUID</code> class defines universally
 * unique identifiers. These 128-bit unsigned integers are guaranteed
 * to be unique across all time and space. Accordingly, an instance of
 * this class is immutable.
 * <p>
 * The Bluetooth specification provides an algorithm describing how a
 * 16-bit or 32-bit UUID could be promoted to a 128-bit UUID.
 * Accordingly, this class provides an interface that assists
 * applications in creating 16-bit, 32-bit, and 128-bit long UUIDs. The
 * methods supported by this class allow equality testing of two UUID
 * objects.
 * <p>
 * The Bluetooth Assigned Numbers document (<A
 * HREF="http://www.bluetooth.org/assigned-numbers/sdp.htm">
 * http://www.bluetooth.org/assigned-numbers/sdp.htm</A>)
 * defines a large number of UUIDs for protocols and service classes.
 * The table below provides a short list of the most common UUIDs
 * defined in the Bluetooth Assigned Numbers document.
 * <TABLE>
 * <TR><TH>Name</TH><TH>Value</TH><TH>Size</TH></TR>
 * <TR><TD>Base UUID Value (Used in promoting 16-bit and 32-bit UUIDs to
 * 128-bit UUIDs)</TD><TD>0x0000000000001000800000805F9B34FB</TD>
 * <TD>128-bit</TD></TR>
 * <TR><TD>SDP</TD><TD>0x0001</TD><TD>16-bit</TD></TR>
 * <TR><TD>RFCOMM</TD><TD>0x0003</TD><TD>16-bit</TD></TR>
 * <TR><TD>OBEX</TD><TD>0x0008</TD><TD>16-bit</TD></TR>
 * <TR><TD>HTTP</TD><TD>0x000C</TD><TD>16-bit</TD></TR>
 * <TR><TD>L2CAP</TD><TD>0x0100</TD><TD>16-bit</TD></TR>
 * <TR><TD>BNEP</TD><TD>0x000F</TD><TD>16-bit</TD></TR>
 * <TR><TD>Serial Port</TD><TD>0x1101</TD><TD>16-bit</TD></TR>
 * <TR><TD>ServiceDiscoveryServerServiceClassID</TD><TD>0x1000</TD>
 * <TD>16-bit</TD></TR>
 * <TR><TD>BrowseGroupDescriptorServiceClassID</TD><TD>0x1001</TD>
 * <TD>16-bit</TD></TR>
 * <TR><TD>PublicBrowseGroup</TD><TD>0x1002</TD><TD>16-bit</TD></TR>
 * <TR><TD>OBEX Object Push
 * Profile</TD><TD>0x1105</TD><TD>16-bit</TD></TR>
 * <TR><TD>OBEX File Transfer
 * Profile</TD><TD>0x1106</TD><TD>16-bit</TD></TR>
 * <TR><TD>Personal Area Networking User</TD><TD>0x1115</TD>
 * <TD>16-bit</TD></TR>
 * <TR><TD>Network Access Point</TD><TD>0x1116</TD><TD>16-bit</TD></TR>
 * <TR><TD>Group Network</TD><TD>0x1117</TD><TD>16-bit</TD></TR>
 * </TABLE>
 * 
 * <DD>1.4</DD>
 * <HR>
 * 
 * 
 * <!-- ======== CONSTRUCTOR SUMMARY ======== -->
 * 
 * <A NAME="constructor_summary"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
 * <B>Constructor Summary</B></FONT></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><B><A HREF="UUID.html#UUID(long)" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html#UUID(long)">UUID</A></B>(long&nbsp;uuidValue)</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Creates a <code>UUID</code> object from <code>long</code> value
 * <code>uuidValue</code>.</TD>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE><B><A HREF="UUID.html#UUID(java.lang.String, boolean)" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html#UUID(java.lang.String, boolean)">UUID</A></B>(java.lang.String&nbsp;uuidValue,
 * boolean&nbsp;shortUUID)</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Creates a <code>UUID</code> object from the string provided.</TD>
 * </TR>
 * </TABLE>
 * &nbsp;
 * <!-- ========== METHOD SUMMARY =========== -->
 * 
 * <A NAME="method_summary"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="2"><FONT SIZE="+2">
 * <B>Method Summary</B></FONT></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
 * <CODE>&nbsp;boolean</CODE></FONT></TD>
 * <TD><CODE><B><A HREF="UUID.html#equals(java.lang.Object)" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html#equals(java.lang.Object)">equals</A></B>(java.lang.Object&nbsp;value)</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Determines if two <code>UUID</code>s are equal.</TD>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
 * <CODE>&nbsp;int</CODE></FONT></TD>
 * <TD><CODE><B><A HREF="UUID.html#hashCode()" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html#hashCode()">hashCode</A></B>()</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Computes the hash code for this object.</TD>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD ALIGN="right" VALIGN="top" WIDTH="1%"><FONT SIZE="-1">
 * <CODE>&nbsp;java.lang.String</CODE></FONT></TD>
 * <TD><CODE><B><A HREF="UUID.html#toString()" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html#toString()">toString</A></B>()</CODE>
 * 
 * <BR>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Returns the string representation of the 128-bit UUID object.</TD>
 * </TR>
 * </TABLE>
 * &nbsp;<A NAME="methods_inherited_from_class_java.lang.Object"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#EEEEFF" CLASS="TableSubHeadingColor">
 * <TH ALIGN="left"><B>Methods inherited from class java.lang.Object</B></TH>
 * </TR>
 * <TR BGCOLOR="white" CLASS="TableRowColor">
 * <TD><CODE>clone, finalize, getClass, notify, notifyAll, wait, wait, wait</CODE></TD>
 * </TR>
 * </TABLE>
 * &nbsp;
 * 
 * <!-- ========= CONSTRUCTOR DETAIL ======== -->
 * 
 * <A NAME="constructor_detail"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="1"><FONT SIZE="+2">
 * <B>Constructor Detail</B></FONT></TH>
 * </TR>
 * </TABLE>
 * 
 * <A NAME="UUID(long)"><!-- --></A><H3>
 * UUID</H3>
 * <PRE>
 * public <B>UUID</B>(long&nbsp;uuidValue)</PRE>
 * <DD>Creates a <code>UUID</code> object from <code>long</code> value
 * <code>uuidValue</code>. A UUID
 * is defined as an unsigned integer whose value can range from
 * [0 to 2<sup>128</sup>-1]. However, this constructor allows only
 * those values that are in the range of [0 to 2<sup>32</sup> -1].
 * Negative values and values in the range of [2<sup>32</sup>,
 * 2<sup>63</sup> -1] are not
 * allowed and will cause an <code>IllegalArgumentException</code> to
 * be thrown.
 * <DD><CODE>java.lang.IllegalArgumentException</CODE> - if <code>uuidValue</code>
 * is not in the range [0, 2<sup>32</sup> -1]</DL>
 * <HR>
 * 
 * <A NAME="UUID(java.lang.String, boolean)"><!-- --></A><H3>
 * UUID</H3>
 * <PRE>
 * public <B>UUID</B>(java.lang.String&nbsp;uuidValue,
 * boolean&nbsp;shortUUID)</PRE>
 * <DD>Creates a <code>UUID</code> object from the string provided.  The
 * characters in the string must be from the hexadecimal set [0-9,
 * a-f, A-F].  It is important to note that the prefix "0x" generally
 * used for hex representation of numbers is not allowed. If the
 * string does not have characters from the hexadecimal set, an
 * exception will be thrown. The string length has to be positive
 * and less than or equal to 32. A string length that exceeds 32 is
 * illegal and will cause an exception. Finally, a <code>null</code> input
 * is also considered illegal and causes an exception.
 * If <code>shortUUID</code> is <code>true</code>, <code>uuidValue</code>
 * represents a 16-bit or 32-bit UUID.  If <code>uuidValue</code> is in
 * the range 0x0000 to 0xFFFF then this constructor will create a
 * 16-bit UUID.  If <code>uuidValue</code> is in the range
 * 0x000010000 to 0xFFFFFFFF, then this constructor will create
 * a 32-bit UUID.  Therefore, <code>uuidValue</code> may only be
 * 8 characters long.
 * On the other hand, if <code>shortUUID</code> is <code>false</code>, then
 * <code>uuidValue</code> represents a 128-bit UUID.  Therefore,
 * <code>uuidValue</code> may only be 32 character long
 * 32-bit or 128-bit UUID<DD><CODE>shortUUID</CODE> - indicates the size of the UUID to be constructed;
 * <code>true</code> is used to indicate short UUIDs,
 * i.e. either 16-bit or 32-bit; <code>false</code> indicates an 128-bit
 * UUID
 * <DD><CODE>java.lang.NumberFormatException</CODE> - if <code>uuidValue</code>
 * has characters that are not defined in the hexadecimal set [0-9,
 * a-f, A-F]
 * <DD><CODE>java.lang.IllegalArgumentException</CODE> - if <code>uuidValue</code>
 * length is zero; if <code>shortUUID</code> is <code>true</code>
 * and <code>uuidValue</code>'s length is  greater than 8; if
 * <code>shortUUID</code> is <code>false</code> and
 * <code>uuidValue</code>'s length is greater than 32
 * <DD><CODE>java.lang.NullPointerException</CODE> - if <code>uuidValue</code> is
 * <code>null</code></DL>
 * 
 * <!-- ============ METHOD DETAIL ========== -->
 * 
 * <A NAME="method_detail"><!-- --></A>
 * <TABLE BORDER="1" WIDTH="100%" CELLPADDING="3" CELLSPACING="0" SUMMARY="">
 * <TR BGCOLOR="#CCCCFF" CLASS="TableHeadingColor">
 * <TH ALIGN="left" COLSPAN="1"><FONT SIZE="+2">
 * <B>Method Detail</B></FONT></TH>
 * </TR>
 * </TABLE>
 * 
 * <A NAME="toString()"><!-- --></A><H3>
 * toString</H3>
 * <PRE>
 * public java.lang.String <B>toString</B>()</PRE>
 * <DD>Returns the string representation of the 128-bit UUID object.
 * The string being returned represents a UUID
 * that contains characters from the hexadecimal set, [0-9,
 * A-F]. It does not include the prefix "0x" that is generally
 * used for hex representation of numbers. The return value will
 * never be <code>null</code>.
 * 
 * <HR>
 * 
 * <A NAME="equals(java.lang.Object)"><!-- --></A><H3>
 * equals</H3>
 * <PRE>
 * public boolean <B>equals</B>(java.lang.Object&nbsp;value)</PRE>
 * <DD>Determines if two <code>UUID</code>s are equal.  They are equal
 * if their 128 bit values are the same. This method will return
 * <code>false</code> if <code>value</code> is
 * <code>null</code> or is not a <code>UUID</code> object.
 * objects are equal, otherwise <code>false</code></DL>
 * <HR>
 * 
 * <A NAME="hashCode()"><!-- --></A><H3>
 * hashCode</H3>
 * <PRE>
 * public int <B>hashCode</B>()</PRE>
 * <DD>Computes the hash code for this object.
 * This method retains the same semantic contract as defined in
 * the class <code>java.lang.Object</code> while overriding the
 * implementation.
 * 
 * <!-- ========= END OF CLASS DATA ========= -->
 * <HR>
 * 
 * 
 * <!-- ======= START OF BOTTOM NAVBAR ====== -->
 * <A NAME="navbar_bottom"><!-- --></A>
 * <A HREF="#skip-navbar_bottom" title="Skip navigation links"></A>
 * <TABLE BORDER="0" WIDTH="100%" CELLPADDING="1" CELLSPACING="0" SUMMARY="">
 * <TR>
 * <TD COLSPAN=2 BGCOLOR="#EEEEFF" CLASS="NavBarCell1">
 * <A NAME="navbar_bottom_firstrow"><!-- --></A>
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="3" SUMMARY="">
 * <TR ALIGN="center" VALIGN="top">
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../overview-summary.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/overview-summary.html"><FONT CLASS="NavBarFont1"><B>Overview</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="package-summary.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/package-summary.html"><FONT CLASS="NavBarFont1"><B>Package</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#FFFFFF" CLASS="NavBarCell1Rev"> &nbsp;<FONT CLASS="NavBarFont1Rev"><B>Class</B></FONT>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="package-tree.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/package-tree.html"><FONT CLASS="NavBarFont1"><B>Tree</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../deprecated-list.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/deprecated-list.html"><FONT CLASS="NavBarFont1"><B>Deprecated</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../index-all.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/index-all.html"><FONT CLASS="NavBarFont1"><B>Index</B></FONT></A>&nbsp;</TD>
 * <TD BGCOLOR="#EEEEFF" CLASS="NavBarCell1">    <A HREF="../../help-doc.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/help-doc.html"><FONT CLASS="NavBarFont1"><B>Help</B></FONT></A>&nbsp;</TD>
 * </TR>
 * </TABLE>
 * </TD>
 * <TD ALIGN="right" VALIGN="top" ROWSPAN=3><EM>
 * <b>JSR 82</b></EM>
 * </TD>
 * </TR>
 * 
 * <TR>
 * <TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
 * &nbsp;<A HREF="ServiceRegistrationException.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/ServiceRegistrationException.html" title="class in javax.bluetooth"><B>PREV CLASS</B></A>&nbsp;
 * &nbsp;NEXT CLASS</FONT></TD>
 * <TD BGCOLOR="white" CLASS="NavBarCell2"><FONT SIZE="-2">
 * <A HREF="../../index.html-javax-bluetooth-UUID.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/index.html?javax/bluetooth/UUID.html" target="_top"><B>FRAMES</B></A>  &nbsp;
 * &nbsp;<A HREF="UUID.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/javax/bluetooth/UUID.html" target="_top"><B>NO FRAMES</B></A>  &nbsp;
 * &nbsp;<SCRIPT type="text/javascript">
 * <!--
 * if(window==top) {
 * document.writeln('<A HREF="../../allclasses-noframe.html"/tpa=http://java.sun.com/javame/reference/apis/jsr082/allclasses-noframe.html><B>All Classes</B></A>');
 * }
 * //-->
 * </SCRIPT>
 * <NOSCRIPT>
 * <A HREF="../../allclasses-noframe.html" tppabs="http://java.sun.com/javame/reference/apis/jsr082/allclasses-noframe.html"><B>All Classes</B></A>
 * </NOSCRIPT>
 * 
 * 
 * </FONT></TD>
 * </TR>
 * <TR>
 * <TD VALIGN="top" CLASS="NavBarCell3"><FONT SIZE="-2">
 * SUMMARY:&nbsp;NESTED&nbsp;|&nbsp;FIELD&nbsp;|&nbsp;<A HREF="#constructor_summary">CONSTR</A>&nbsp;|&nbsp;<A HREF="#method_summary">METHOD</A></FONT></TD>
 * <TD VALIGN="top" CLASS="NavBarCell3"><FONT SIZE="-2">
 * DETAIL:&nbsp;FIELD&nbsp;|&nbsp;<A HREF="#constructor_detail">CONSTR</A>&nbsp;|&nbsp;<A HREF="#method_detail">METHOD</A></FONT></TD>
 * </TR>
 * </TABLE>
 * <A NAME="skip-navbar_bottom"></A>
 * <!-- ======== END OF BOTTOM NAVBAR ======= -->
 * 
 * <HR>
 * <small>Copyright (c) 2006 Sun Microsystems, Inc. All rights reserved. <b>Use is subject to <a href="http://java.sun.com/javame/reference/apis/license.html" target="_top">License Terms</a>.</b> Your use of this web site or any of its content or software indicates your agreement to be bound by these License Terms.<br><br>For more information, please consult the <a href="http://jcp.org/en/jsr/detail?id=82" target="_top">JSR 82 specification.</a></small>
 * </BODY>
 * <script language="JavaScript" src="../../../../../../js/omi/jsc/s_code_remote.js" tppabs="http://java.sun.com/js/omi/jsc/s_code_remote.js"></script></HTML>
 * 
 */
public class UUID extends java.lang.Object
{
	/**
	 * Creates a <code>UUID</code> object from <code>long</code> value
	 * <code>uuidValue</code>. A UUID
	 * is defined as an unsigned integer whose value can range from
	 * [0 to 2<sup>128</sup>-1]. However, this constructor allows only
	 * those values that are in the range of [0 to 2<sup>32</sup> -1].
	 * Negative values and values in the range of [2<sup>32</sup>,
	 * 2<sup>63</sup> -1] are not
	 * allowed and will cause an <code>IllegalArgumentException</code> to
	 * be thrown.
	 * <P>
	 * 
	 * @param uuidValue - the 16-bit or 32-bit value of the UUID
	 * @throws java.lang.IllegalArgumentException - if uuidValue is not in the range [0, 2 32 -1]
	 */
	public UUID(long uuidValue)
	{
		//TODO implement UUID
	}

	/**
	 * Creates a <code>UUID</code> object from the string provided.  The
	 * characters in the string must be from the hexadecimal set [0-9,
	 * a-f, A-F].  It is important to note that the prefix "0x" generally
	 * used for hex representation of numbers is not allowed. If the
	 * string does not have characters from the hexadecimal set, an
	 * exception will be thrown. The string length has to be positive
	 * and less than or equal to 32. A string length that exceeds 32 is
	 * illegal and will cause an exception. Finally, a <code>null</code> input
	 * is also considered illegal and causes an exception.
	 * <P>
	 * If <code>shortUUID</code> is <code>true</code>, <code>uuidValue</code>
	 * represents a 16-bit or 32-bit UUID.  If <code>uuidValue</code> is in
	 * the range 0x0000 to 0xFFFF then this constructor will create a
	 * 16-bit UUID.  If <code>uuidValue</code> is in the range
	 * 0x000010000 to 0xFFFFFFFF, then this constructor will create
	 * a 32-bit UUID.  Therefore, <code>uuidValue</code> may only be
	 * 8 characters long.
	 * <P>
	 * On the other hand, if <code>shortUUID</code> is <code>false</code>, then
	 * <code>uuidValue</code> represents a 128-bit UUID.  Therefore,
	 * <code>uuidValue</code> may only be 32 character long
	 * <P>
	 * 
	 * @param uuidValue - the string representation of a 16-bit, 32-bit or 128-bit UUID
	 * @param shortUUID - indicates the size of the UUID to be constructed; true is used to indicate short UUIDs, i.e. either 16-bit or 32-bit; false indicates an 128-bit UUID
	 * @throws java.lang.NumberFormatException - if uuidValue has characters that are not defined in the hexadecimal set [0-9, a-f, A-F]
	 * @throws java.lang.IllegalArgumentException - if uuidValue length is zero; if shortUUID is true and uuidValue's length is  greater than 8; if shortUUID is false and uuidValue's length is greater than 32
	 * @throws java.lang.NullPointerException - if uuidValue is null
	 */
	public UUID(java.lang.String uuidValue, boolean shortUUID)
	{
		//TODO implement UUID
	}

	/**
	 * Returns the string representation of the 128-bit UUID object.
	 * The string being returned represents a UUID
	 * that contains characters from the hexadecimal set, [0-9,
	 * A-F]. It does not include the prefix "0x" that is generally
	 * used for hex representation of numbers. The return value will
	 * never be <code>null</code>.
	 * <P>
	 * 
	 * @return the string representation of the UUID
	 * @see Object#toString()
	 */
	public java.lang.String toString()
	{
		return null;
		//TODO implement toString
	}

	/**
	 * Determines if two <code>UUID</code>s are equal.  They are equal
	 * if their 128 bit values are the same. This method will return
	 * <code>false</code> if <code>value</code> is
	 * <code>null</code> or is not a <code>UUID</code> object.
	 * <P>
	 * 
	 * @param value - the object to compare to
	 * @return true if the 128 bit values of the two objects are equal, otherwise false
	 * @see Object#equals(Object)
	 */
	public boolean equals(java.lang.Object value)
	{
		return false;
		//TODO implement equals
	}

	/**
	 * Computes the hash code for this object.
	 * This method retains the same semantic contract as defined in
	 * the class <code>java.lang.Object</code> while overriding the
	 * implementation.
	 * <P>
	 * 
	 * @return the hash code for this object
	 * @see Object#hashCode()
	 */
	public int hashCode()
	{
		return 0;
		//TODO implement hashCode
	}

}
