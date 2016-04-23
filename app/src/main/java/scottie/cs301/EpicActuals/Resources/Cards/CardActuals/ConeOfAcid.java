package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class ConeOfAcid extends CardNode {
    protected ConeOfAcid() {
        super(21, 4, 3, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foeL = returnLeft(myCasterNum);
        int foeR = returnRight(myCasterNum);

        int roll = rollPower(spell, 21);

        if(roll <= 4) {
            damage(foeL, 1);
            damage(foeR, 1);
        }
        else if(roll <= 9) {
            damage(foeL, 2);
            damage(foeR, 2);
        }
        else {
            damage(foeL, 4);
            damage(foeR, 4);
            //gain Treasure
        }
    }
}
