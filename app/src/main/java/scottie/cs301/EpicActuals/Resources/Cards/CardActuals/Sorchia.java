package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Sorchia extends CardNode {
    protected Sorchia() {
        super(9, 0, 1, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int strongest = returnStrongest(myCasterNum);

        damage(strongest, 3);
    }
}
