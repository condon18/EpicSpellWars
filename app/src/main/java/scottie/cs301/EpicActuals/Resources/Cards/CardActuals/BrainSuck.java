package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Cards.Card;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class BrainSuck extends CardNode {
    protected BrainSuck() {
        super(18, 15, 3, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = chooseFoe(myCasterNum);

        int roll = rollPower(spell, 18);

        if (roll <= 4) {
            damage(foe, 1);
        }
        else if (roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe, 4);
            // steal one of foe's treasures
        }
    }
}
