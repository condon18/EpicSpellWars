package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Phantasmagoons extends CardNode {
    protected Phantasmagoons() {
        super(34, 17, 3, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnRight(myCasterNum);

        int roll = rollPower(spell, 34);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe, 4;
        }
    }
}
