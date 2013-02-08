// TexFilter.java

package sgfimporter.tex;

import java.io.File;
import javax.swing.filechooser.FileFilter;

import sgfimporter.util.FileUtil;

/** File filter for accepting LaTeX files. */
public class TexFilter
    extends FileFilter
{
    public boolean accept(File file)
    {
        if (file.isDirectory())
            return true;
        return FileUtil.hasExtension(file, "tex");
    }

    public String getDescription()
    {
        return "LaTex files (*.tex)";
    }

}
