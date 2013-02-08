// ConstClock.java

package sgfimporter.game;

import sgfimporter.go.GoColor;

/** Const functions of game.Clock.
    @see Clock */
public interface ConstClock
{
    int getMovesLeft(GoColor color);

    long getTimeLeft(GoColor color);

    TimeSettings getTimeSettings();

    String getTimeString(GoColor color);

    GoColor getToMove();

    boolean getUseByoyomi();

    boolean isInitialized();

    boolean isInByoyomi(GoColor color);

    boolean isRunning();

    boolean lostOnTime(GoColor color);
}
