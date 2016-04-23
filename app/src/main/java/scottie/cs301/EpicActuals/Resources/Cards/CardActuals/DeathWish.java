package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class DeathWish extends CardNode {
    protected DeathWish() {
        super(22, 8, 3, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnRight(myCasterNum);

        int roll = rollPower(spell, 22);

        if(roll <= 4) {
            damage(foe, 2);
            damage(myCasterNum, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
            damage(myCasterNum, 1);
        }
        else {
            damage(foe,5);
            damage(myCasterNum, 1);
        }
    }
}
