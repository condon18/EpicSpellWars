package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MercyKilling extends CardNode {
    protected MercyKilling() {
        super(31, 5, 3, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnWeakest(myCasterNum);

        int roll = rollPower(spell, 31);

        if(roll <= 4) {
            damage(foe, 2);
        }
        else if(roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe,4);
        }
    }
}
