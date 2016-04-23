package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Devilicious extends CardNode {
    protected Devilicious() {
        super(23, 0, 2, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = chooseFoe(myCasterNum);

        int roll = rollPower(spell, 23);

        if(roll <= 4) {
            damage(foe, 2);
        }
        else if(roll <= 9) {
            damage(foe, 4);
            damage(myCasterNum, 1);
        }
        else {
            damage(foe,5);
            damage(myCasterNum, 2);
        }
    }
}
