package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * This is an example class. There will be 52 subclasses of CardNode.
 * Each contains its initial values and its resolve method.
 */
public class CardActualExample extends CardNode
{
    public CardActualExample() { super(-1, -1, -1, -1, null); } //basic constructor. values hardcoded per subclass

    @Override public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {} //the reason for a mess of subclasses. each card unique method.
}
