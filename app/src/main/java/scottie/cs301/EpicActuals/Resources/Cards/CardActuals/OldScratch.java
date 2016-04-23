package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class OldScratch extends CardNode {
    protected OldScratch() {
        super(13, 0, 1, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int roll = rollDie(myCasterNum);

        if(roll <= 3) {
            damage(myCasterNum, roll);
        }
        else {
            heal(myCasterNum, roll);
        }
    }
}
