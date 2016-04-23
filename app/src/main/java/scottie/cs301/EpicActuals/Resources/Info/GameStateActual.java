package scottie.cs301.EpicActuals.Resources.Info;

import scottie.cs301.Imports.GameFramework.infoMsg.GameState;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * GameState subclass that contains all of current game information.
 * Basic methods provided, although most action taken in LocalGameActual.
 */
public class GameStateActual extends GameState
{
    protected PlayerDataNode[] playerDataNodes; //current info on each player
    public LOCATION[] cardLocation; //parallel array to DECK that contains location of each card
    public int progressCounter; //int reference to advance round actions. parsed out by player receive info.

    public GameStateActual(int numPlayers) {
        progressCounter = 0;

        //for ()

    } //starting constructor
    public GameStateActual(int PlayerNum, GameStateActual masterState) {} //limited constructor for dispatching known info to players
    public void shuffle() {} //shuffles discard, adds to draw pile
    public void addSpell(int PlayerNum, int card1, int card2, int card3) {} //most edits come in by this
    public int randomCard(LOCATION startLoc) {return -1;} //used as helper method in some circumstances
}
