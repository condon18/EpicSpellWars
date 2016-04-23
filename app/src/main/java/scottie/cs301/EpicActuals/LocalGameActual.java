package scottie.cs301.EpicActuals;

import scottie.cs301.EpicActuals.Resources.Actions.EpicAction;
import scottie.cs301.EpicActuals.Resources.Actions.SendChoice;
import scottie.cs301.EpicActuals.Resources.Actions.SendOverrideAction;
import scottie.cs301.EpicActuals.Resources.Actions.SendSpell;
import scottie.cs301.EpicActuals.Resources.Cards.Deck;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;
import scottie.cs301.EpicActuals.Resources.Info.LOCATION;
import scottie.cs301.Imports.GameFramework.GamePlayer;
import scottie.cs301.Imports.GameFramework.LocalGame;
import scottie.cs301.Imports.GameFramework.actionMsg.GameAction;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * Local Game subclass that will be the main driver for gameplay.
 * Contains static Deck reference.
 * Receives actions and dispatches changes to Game State.
 */
public class LocalGameActual extends LocalGame
{
    private GameStateActual masterState = null;
    public final static Deck DECK = new Deck(); //static reference array

    @Override protected void sendUpdatedStateTo(GamePlayer p) {} //takes state and passes it along
    @Override protected boolean canMove(int playerIdx) {return false;} //basic canMove checking
    protected boolean canMove(EpicAction incAction)
    {
        if (incAction instanceof SendSpell)
        {
            return (masterState.progressCounter == 1);
        }

        return false;
    }
    @Override protected String checkIfGameOver() {return null;} //end game string
    @Override protected boolean makeMove(GameAction action)
    {
        if (action instanceof EpicAction)
        {
            EpicAction converted = (EpicAction) action;
//            if ( canMove(converted) )
//            {
//                try
//                {
//                    doMove(converted);
//                    return true;
//                }
//                catch(InvalidParameterException trash)
//                {
//                    return false;
//                }
//            }
            if (converted instanceof SendSpell)
            {
                SendSpell convertedest = (SendSpell) converted;
                //this is ugly and it makes scott angry to do this

                if (canMove(convertedest))
                {
                    doMove(convertedest);
                }
            }
        }
        return false;
    } //parse and dispatch actions to GameState
    protected void doMove(SendChoice action) {} //if valid, sent to doMove
    protected void doMove(SendOverrideAction action) {} //if valid, sent to doMove
    protected void doMove(SendSpell action)
    {
        for(int index : action.theSpell)
        {
            if ( masterState.cardLocation[index] == findLoc( action.getPlayerNum() , true ) )
            {
                masterState.cardLocation[index] = findLoc(action.getPlayerNum(),
                                                          false);
            }
        }

    } //if valid, sent to doMove

    public LOCATION findLoc( int playerNum, boolean isHandNotSpell )
    {
        switch (playerNum)
        {
            case 1: if (
                    isHandNotSpell) return LOCATION.PlayerOneHand;
                else return LOCATION.PlayerOneSpell;

            case 2: if (isHandNotSpell) return LOCATION.PlayerTwoHand;
                else return  LOCATION.PlayerTwoSpell;
        }

        return null;
    }
}
