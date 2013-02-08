// ConstNode.java

package sgfimporter.game;

import java.util.Map;

import sgfimporter.go.ConstPointList;
import sgfimporter.go.GoColor;
import sgfimporter.go.GoPoint;
import sgfimporter.go.Move;

/** Const functions of game.Node.
    @see Node */
public interface ConstNode
{
    String getComment();

    ConstNode getFatherConst();

    ConstNode getChildConst();

    ConstNode getChildConst(int i);

    int getChildIndex(ConstNode child);

    ConstGameInfo getGameInfoConst();

    String getLabel(GoPoint point);

    Map<GoPoint,String> getLabelsUnmodifiable();

    ConstPointList getMarkedConst(MarkType type);

    Move getMove();

    int getMovesLeft(GoColor color);

    int getNumberChildren();

    GoColor getPlayer();

    ConstPointList getSetup(GoColor c);

    ConstSgfProperties getSgfPropertiesConst();

    double getTimeLeft(GoColor color);

    GoColor getToMove();

    float getValue();

    boolean hasChildren();

    boolean hasComment();

    boolean hasFather();

    boolean hasSetup();

    boolean isEmpty();

    ConstNode variationAfter(ConstNode child);

    ConstNode variationBefore(ConstNode child);
}
