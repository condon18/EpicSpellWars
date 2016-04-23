package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MagmaGog extends CardNode {
    protected MagmaGog() {
        super(4, 0, 1, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        String[] magma = {"Deal 3 damage to foe on left", "Deal 1 damage to each foe"};
        int choice = setChoice(magma);

        if (choice == 0) {
            int left = returnLeft(myCasterNum);
            damage(left, 3);
        }
        else {
            int left = returnLeft(myCasterNum);

            while(left != myCasterNum) {
                left = returnLeft(left);

                damage(left, 1);
            }
        }

    }
}
