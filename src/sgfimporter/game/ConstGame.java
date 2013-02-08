// ConstGame.java

package sgfimporter.game;

import sgfimporter.go.ConstBoard;
import sgfimporter.go.GoColor;

/** Const functions of game.Game.
    @see Game */
public interface ConstGame
{
    ConstBoard getBoard();

    ConstClock getClock();

    ConstNode getCurrentNode();

    ConstGameInfo getGameInfo(ConstNode node);

    ConstNode getGameInfoNode();

    int getMoveNumber();

    ConstNode getRoot();

    int getSize();

    GoColor getToMove();

    ConstGameTree getTree();

    boolean isModified();
}
