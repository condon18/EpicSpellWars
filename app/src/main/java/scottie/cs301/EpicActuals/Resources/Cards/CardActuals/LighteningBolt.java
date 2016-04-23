package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class LighteningBolt extends CardNode {
    protected LighteningBolt() {
        super(29, 9, 3, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foeL = returnLeft(myCasterNum);
        int foeLL = returnLeft(foeL);

        int roll = rollPower(spell, 29);

        if(roll <= 4) {
            damage(foeL, 1);
            damage(foeLL, 1);
        }
        else if(roll <= 9) {
            damage(foeL, 2);
            damage(foeLL, 2);
        }
        else {
            damage(foeL,4);
            damage(foeLL, 4);
        }
    }
}
