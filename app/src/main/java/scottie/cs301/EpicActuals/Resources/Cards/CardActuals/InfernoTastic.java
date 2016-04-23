package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class InfernoTastic extends CardNode {
    protected InfernoTastic() {
        super(50, 0, 2, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int element = elementalGlyph(spell);

        int foe = returnLeft(myCasterNum);

        while(foe != myCasterNum) {
            damage(foe, element);
            foe = returnLeft(foe);
        }
    }
}
