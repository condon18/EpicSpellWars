package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class FountainOfYouth extends CardNode {
    protected FountainOfYouth() {
        super(55, 12, 3, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int roll = rollPower(spell, 55);

        if (roll <= 4) {
            //
        }
        else if (roll <= 9) {
            heal(myCasterNum, 2);
        }
        else {
            heal(myCasterNum, 4);
        }
    }
}
