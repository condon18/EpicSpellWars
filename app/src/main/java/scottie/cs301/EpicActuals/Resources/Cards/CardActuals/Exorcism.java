package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Exorcism extends CardNode {
    protected Exorcism() {
        super(25, 11, 23, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnLeft(myCasterNum);

        int roll = rollPower(spell, 25);

        while (foe != myCasterNum) {
            if (roll <= 4) {
                damage(myCasterNum, 1);
            } else if (roll <= 9) {
                // if foe has Last Wizard Standing Token
                damage(foe, 4);
                //else
                damage(foe, 2);
            } else {
                // if foe has Last Wizard Standing Token
                damage(foe, 8);
                //else
                damage(foe, 4);
            }
            foe = returnLeft(foe);
        }
    }
}
