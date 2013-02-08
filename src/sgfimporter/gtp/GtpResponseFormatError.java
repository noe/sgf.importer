// GtpResponseFormatError.java

package sgfimporter.gtp;

/** Error used if parsing a GTP response fails.
    This error is used if the response to a GTP command is expected to be
    in a particular format (e.g. a point), but is in a different format. */
public class GtpResponseFormatError
    extends Exception
{
	private static final long serialVersionUID = 1L;
	public GtpResponseFormatError(String s)
    {
        super(s);
    }
}
