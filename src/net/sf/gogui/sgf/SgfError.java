// SgfError.java

package net.sf.gogui.sgf;

import net.sf.gogui.util.ErrorMessage;

/** SGF read error. */
public class SgfError
    extends ErrorMessage
{
	private static final long serialVersionUID = 1L;

	/** Constructor.
        @param message Error message. */
    public SgfError(String message)
    {
        super(message);
    }
}
