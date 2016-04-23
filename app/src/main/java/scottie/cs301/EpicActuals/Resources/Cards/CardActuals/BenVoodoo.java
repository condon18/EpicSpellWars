package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class BenVoodoo extends CardNode {
    protected BenVoodoo() {
        super(17, 0, 1, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnLeft(myCasterNum);
        int roll;

        while(foe != myCasterNum) {
            foe = returnLeft(foe);
            roll = rollDie(foe);
            damage(foe, roll);

        }
    }
}
