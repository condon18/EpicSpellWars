package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Players.Human;
import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class RoseBottom extends CardNode {
    protected RoseBottom() {
        super(52, 0, 1, -1, SCHOOL.PRIMAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int primal = primalGlyph(spell);
        int elemental = elementalGlyph(spell);
        int illusion = illusionGlyph(spell);
        int dark = darkGlyph(spell);
        int arcane = arcaneGlyph(spell);

        int healMe = 0;

        if (primal > 0){
            healMe++;
        }
        if (elemental >0){
            healMe++;
        }
        if (illusion > 0) {
            healMe++;
        }
        if(dark > 0) {
            healMe++;
        }
        if (arcane > 0) {
            healMe++;
        }

        heal(myCasterNum, healMe);
    }
}
