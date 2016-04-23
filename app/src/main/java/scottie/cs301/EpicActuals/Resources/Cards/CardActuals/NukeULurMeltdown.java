package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class NukeULurMeltdown extends CardNode {
    protected NukeULurMeltdown() {
        super(32, 10, 3, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnStrongest(myCasterNum);
        int foeL = returnLeft(foe);
        int foeR = returnRight(foe);

        int roll = rollPower(spell, 32);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
            damage(foeL, 1);
            damage(foeR, 1);
        }
        else {
            damage(foe,5);
            damage(foeL, 1);
            damage(foeR, 1);
        }
    }
}
