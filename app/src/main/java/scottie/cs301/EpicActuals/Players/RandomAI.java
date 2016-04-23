package scottie.cs301.EpicActuals.Players;

import java.util.Random;

import scottie.cs301.EpicActuals.Resources.Actions.CHOICE;
import scottie.cs301.EpicActuals.Resources.Actions.SendSpell;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;
import scottie.cs301.EpicActuals.Resources.Info.LOCATION;
import scottie.cs301.Imports.GameFramework.Game;
import scottie.cs301.Imports.GameFramework.GameComputerPlayer;
import scottie.cs301.Imports.GameFramework.infoMsg.GameInfo;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * This is the basic AI player.
 * It receives info, stores, and responds when asked.
 * This AI will be random. "Smarter" AI(s) will be subclasses of this.
 */
public class RandomAI extends GameComputerPlayer
{
    protected GameStateActual myRecentState; //full copy of most recently received Game State for easier access
    protected LOCATION myHandRefValue;

    public RandomAI(String name, LOCATION refValue)
    {
        super(name);
        myHandRefValue = refValue;
    } //default constructor

    @Override protected void receiveInfo(GameInfo info)
    {
        if(info instanceof GameStateActual) //only react if info is a full state
        {
            myRecentState = (GameStateActual) info; //cast it and store

            if(myRecentState.progressCounter == 1) //val 1 = time to pick cards
            {
                this.game.sendAction(new SendSpell(this, selectNextSpell()));
            }
        }

    } //assign value to Recent State and dispatch helper methods

    public int[] selectNextSpell()
    {
        int[] spell = new int[3];

        Random rand = new Random();
        int numCardsInSpell = 1 + rand.nextInt(3);
        //select a random number of 1, 2, or 3 of cards to pick
        //pulled from java doc for inclusive or exclusive question

        for(int i = 0; i < numCardsInSpell; i++)
        {
            spell[i] = myRecentState.randomCard(myHandRefValue);
            //first card = go to game state, get random card from my hand

            myRecentState.cardLocation[spell[i]] = LOCATION.Discard;
            //tell (my) game state which card was pulled
        }

        return spell;
    } //use Recent State and pick cards

    public CHOICE respondToQuestion(CHOICE[] validAnswers)
    {
        Random rand = new Random();
        return validAnswers[ rand.nextInt( validAnswers.length ) ]; //pick a random return from the given
    } //contextual response
}
