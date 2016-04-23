package scottie.cs301.EpicActuals.Resources.Actions;

import scottie.cs301.Imports.GameFramework.GamePlayer;
import scottie.cs301.Imports.GameFramework.actionMsg.GameAction;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * This is a middle management layer to insert an additional method.
 * To return an int ID for the player rather than a GamePlayer object.
 */
public class EpicAction extends GameAction
{
    public EpicAction(GamePlayer player) { super(player); } //just passing through. Don't mind me.
    public int getPlayerNum() { return -1; } //rip the PlayerNum out of the player for ease later
}
