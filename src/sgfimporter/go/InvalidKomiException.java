// InvalidKomiException.java

package sgfimporter.go;

import sgfimporter.util.ErrorMessage;

/** Exception thrown if parsing a komi from a string fails. */
public class InvalidKomiException
    extends ErrorMessage
{
	private static final long serialVersionUID = 1L;
    public InvalidKomiException(String s)
    {
        super("Invalid komi: " + s);
    }
}
