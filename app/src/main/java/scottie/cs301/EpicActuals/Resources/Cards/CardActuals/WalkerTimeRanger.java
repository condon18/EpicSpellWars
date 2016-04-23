package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class WalkerTimeRanger extends CardNode {
    protected WalkerTimeRanger() {
        super(42, 0, 1, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // Each player rolls a die. Add 1 to your roll for each different glyph in your spell. Deal 3 damage to the lowest rollers

    }
}
