// GameFile.java

package sgfimporter.gamefile;

import java.io.File;

public class GameFile
{
    public enum Format
    {
        SGF,

        XML
    }

    public File m_file;

    public Format m_format;
}
