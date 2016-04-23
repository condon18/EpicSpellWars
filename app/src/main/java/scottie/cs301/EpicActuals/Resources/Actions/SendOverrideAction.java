package scottie.cs301.EpicActuals.Resources.Actions;

import scottie.cs301.Imports.GameFramework.GamePlayer;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * Similar to SendChoice, but for actions that are not internal gameplay. (Quit, Save, etc.)
 */
public class SendOverrideAction extends EpicAction
{
    public final MENU theMenuAction; //the menu choice being sent

    public SendOverrideAction(GamePlayer player, MENU myMenuSelection) //basic constructor
    {
        super(player);
        theMenuAction = myMenuSelection;
    }
}
