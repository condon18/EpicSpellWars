package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Delicious extends CardNode {
    protected Delicious() {
        super(49, 0, 2, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int primal = primalGlyph(spell);
        int elemental = elementalGlyph(spell);
        int illusion = illusionGlyph(spell);
        int dark = darkGlyph(spell);
        int arcane = arcaneGlyph(spell);

        int dam = 0;

        if (primal > 0){
            dam++;
        }
        if (elemental >0){
            dam++;
        }
        if (illusion > 0) {
            dam++;
        }
        if(dark > 0) {
            dam++;
        }
        if (arcane > 0) {
            dam++;
        }

        // foes wilth odd number of HP take damage dam
    }
}
