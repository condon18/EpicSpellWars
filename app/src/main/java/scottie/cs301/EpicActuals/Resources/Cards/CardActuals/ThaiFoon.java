package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class ThaiFoon extends CardNode {
    protected ThaiFoon() {
        super(10, 0, 1, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int[] casted = hasPlayed(myCasterNum);

        for(int i = 0; i < casted.length; i++) {
            damage(casted[i], 3);
        }
    }
}
