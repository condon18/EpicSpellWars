package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Boulderiffic extends CardNode {
    protected Boulderiffic() {
        super(2, 0, 2, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int count = 0;
        int curPlayer = returnLeft(myCasterNum);

       while (curPlayer != myCasterNum) {
           curPlayer = returnLeft(curPlayer);
           count++;

           damage(curPlayer, count);
       }
    }
}
