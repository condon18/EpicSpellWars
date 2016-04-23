package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Explodifying extends CardNode {
    protected Explodifying() {
        super(26, 0, 2, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = chooseFoe(myCasterNum);

        int roll = rollPower(spell, 26);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
            damage(myCasterNum, 1);
        }
        else {
            damage(foe,4);
            // choose and destroy one of foe's Treasures
        }
    }
}
