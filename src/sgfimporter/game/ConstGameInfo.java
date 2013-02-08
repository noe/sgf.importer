// ConstGameInfo.java

package sgfimporter.game;

import sgfimporter.go.GoColor;
import sgfimporter.go.Komi;
import sgfimporter.go.Score.ScoringMethod;

/** Const functions of game.GameInfo.
    @see GameInfo */
public interface ConstGameInfo
{
    String get(StringInfo type);

    String get(StringInfoColor type, GoColor c);

    int getHandicap();

    Komi getKomi();

    TimeSettings getTimeSettings();

    ScoringMethod parseRules();

    String suggestGameName();
}
