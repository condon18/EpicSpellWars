package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class DiscoMirrored extends CardNode {
    protected DiscoMirrored() {
        super(45, 0, 2, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // copies source or delivery of spell
    }
}
