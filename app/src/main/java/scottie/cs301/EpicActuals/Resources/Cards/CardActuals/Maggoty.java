package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Maggoty extends CardNode {
    protected Maggoty() {
        super(51, 0, 2, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int dark = darkGlyph(spell);
        int foe = returnStrongest(myCasterNum);

        dark = dark * 2;
        damage(foe,dark);
    }
}
