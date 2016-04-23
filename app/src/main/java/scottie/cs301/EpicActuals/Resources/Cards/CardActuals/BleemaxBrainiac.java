package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class BleemaxBrainiac extends CardNode {
    protected BleemaxBrainiac() {
        super(44, 0, 1, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // Reveal the top two cards of Main Deck. Eac one with glyph that matches a glyph in your spell is added to your spell.
        // Discard the rest
    }
}
