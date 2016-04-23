package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Wyrmtor extends CardNode {
    protected Wyrmtor() {
        super(54, 0, 1, -1, SCHOOL.ELEMENTAL);
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

        int foe = returnLeft(myCasterNum);

        while (foe != myCasterNum) {
            damage(foe, dam);
            foe = returnLeft(foe);
        }
    }
}
