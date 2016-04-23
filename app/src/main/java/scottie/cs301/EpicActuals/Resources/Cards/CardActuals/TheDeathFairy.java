package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class TheDeathFairy extends CardNode {
    protected TheDeathFairy() {
        super(11, 0, 1, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // deal 2 damage to any foe; if he dies, repeat effect
    }
}
