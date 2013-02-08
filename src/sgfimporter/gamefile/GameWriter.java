// GameWriter.java

package sgfimporter.gamefile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import sgfimporter.game.ConstGameTree;
import sgfimporter.sgf.SgfWriter;
import sgfimporter.util.ErrorMessage;
import sgfimporter.xml.XmlWriter;

public class GameWriter
{
    public GameWriter(GameFile gameFile, ConstGameTree tree,
                      String application, String version) throws ErrorMessage
    {
        OutputStream out;
        try
        {
            out = new FileOutputStream(gameFile.m_file);
        }
        catch (FileNotFoundException e)
        {
            throw new ErrorMessage(e.getMessage());
        }
        switch (gameFile.m_format)
        {
        case SGF:
            new SgfWriter(out, tree, application, version);
            break;
        case XML:
            String xmlApplication = application;
            if (xmlApplication != null && version != null)
                xmlApplication = xmlApplication + ":" + version;
            new XmlWriter(out, tree, xmlApplication);
            break;
        }
    }
}
