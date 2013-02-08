// ParseError.java

package sgfimporter.text;

import sgfimporter.util.ErrorMessage;

/** Exception indicating the failure of TextParser. */
public class ParseError
    extends ErrorMessage
{
	private static final long serialVersionUID = 1L;
	public ParseError(String s)
    {
        super(s);
    }
}
