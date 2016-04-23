package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MightyGro extends CardNode {
    protected MightyGro() {
        super(57, 0, 2, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        heal(myCasterNum, 2);
        int weakest = returnWeakest(myCasterNum);

        if (weakest == myCasterNum) {
            // add random card from your card from your hand to spell
        }
    }
}
