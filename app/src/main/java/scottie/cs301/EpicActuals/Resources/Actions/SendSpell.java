package scottie.cs301.EpicActuals.Resources.Actions;

import scottie.cs301.Imports.GameFramework.GamePlayer;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * The main player action.
 * Sending three cards as int indices that refer to the DECK element.
 */
public class SendSpell extends EpicAction
{
    public final int[] theSpell; //the three cards being sent

    public SendSpell(GamePlayer player, int[] mySpell) //basic constructor
    {
        super(player);
        theSpell = mySpell;
    }
}
