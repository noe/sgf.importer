// InvalidPointException.java

package sgfimporter.go;

/** Thrown if parsing a string representation of a GoPoint fails. */
public class InvalidPointException
    extends Exception
{
	private static final long serialVersionUID = 1L;
	/** Constructor.
        @param text The text that could not be parsed as a point. */
    public InvalidPointException(String text)
    {
        super("Invalid point \"" + text + "\"");
    }
}
