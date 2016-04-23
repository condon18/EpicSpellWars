package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class DrRootyBark extends CardNode {
    protected DrRootyBark() {
        super(54, 0, 1, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        heal(myCasterNum, 3);

        int roll[][];

        int foe = returnLeft(myCasterNum);

        while(foe != myCasterNum) {
            // all foes roll and if they roll 6- heals 3 hp
        }
    }
}
