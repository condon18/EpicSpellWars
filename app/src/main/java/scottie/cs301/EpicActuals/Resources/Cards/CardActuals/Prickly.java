package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Prickly extends CardNode {
    protected Prickly() {
        super(37, 0, 2, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnRight(myCasterNum);

        int roll = rollPower(spell, 37);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 1);
            heal(myCasterNum, 1);
        }
        else {
            damage(foe,3);
            heal(myCasterNum, 3);
        }
    }
}
