// SgfError.java

package sgfimporter.sgf;

import sgfimporter.util.ErrorMessage;

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
