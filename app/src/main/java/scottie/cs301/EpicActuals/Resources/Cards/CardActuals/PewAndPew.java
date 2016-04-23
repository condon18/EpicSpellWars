package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class PewAndPew extends CardNode {
    protected PewAndPew() {
        super(47, 0, 1, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // Reveal top four cards of Main Deck. Add any revealed Source cards to your deck and discard the rest
    }
}
