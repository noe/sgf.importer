//----------------------------------------------------------------------------
// $Id$
//----------------------------------------------------------------------------

package net.sf.gogui.gui;

import java.awt.Component;
import javax.swing.JOptionPane;
import net.sf.gogui.go.Komi;
import net.sf.gogui.gtp.GtpError;
import net.sf.gogui.util.StringUtil;

/** Static utility functions. */
public final class GuiGtpUtil
{
    /** Set komi.
        Sends the komi command if the CommandThread is not null and
        it supports the command.
        Errors are shown to the user.
    */
    public static void sendKomi(Component parent, Komi komi,
                                String name, GuiGtpClient gtp)
    {
        if (gtp == null || komi == null)
            return;
        try
        {
            if (gtp.isSupported("komi"))
                gtp.send("komi " + komi);
        }
        catch (GtpError e)
        {
            showError(parent, name, e);
        }
    }

    public static void showError(Component parent, String name,
                                 GtpError error)
    {
        showError(parent, name, error, true);
    }

    public static void showError(Component parent, String name,
                                 GtpError error, boolean isSignificant)
    {
        showError(parent, null, name, error, isSignificant);
    }

    public static void showError(Component parent, String prefix, String name,
                                 GtpError error, boolean isSignificant)
    {        
        String message;
        if (prefix != null)
            message = prefix + "\n";
        else
            message = "";
        String response = error.getMessage().trim();
        if (response.length() == 0)
            message += "Command failed";
        else
            message += StringUtil.capitalize(response);
        String title = "Error";
        if (name != null)
            title = title + " - " + name;
        int type;
        if (isSignificant)
            type = JOptionPane.ERROR_MESSAGE;
        else
            type =JOptionPane.PLAIN_MESSAGE;
        JOptionPane.showMessageDialog(parent, message, title, type);
    }

    /** Make constructor unavailable; class is for namespace only. */
    private GuiGtpUtil()
    {
    }
}

