package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MidnightMerlin extends CardNode {
    protected MidnightMerlin() {
        super(5, 0, 1, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int strongest = returnStrongest(myCasterNum);
        int alive = returnAlive(myCasterNum);

        damage(strongest, alive);

        // add Dead Wizard Card
    }
}
