package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Impatient extends CardNode {
    protected Impatient() {
        super(3, 100, 2, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int left = returnLeft(myCasterNum);

        while (left != myCasterNum) {
            left = returnLeft(left);

            damage(left, 1);
        }
    }
}
