package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class PowerVortex extends CardNode {
    protected PowerVortex() {
        super(36, 16, 3, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnLeft(myCasterNum);

        int roll = rollPower(spell, 36);

        while(foe != myCasterNum) {
            if (roll <= 4) {
               // you discard
            } else if (roll <= 9) {
                damage(foe, 2);
                // you discard 2 cards
            } else {
                damage(foe, 2);
                // you discard two cards and gain Treasure
            }
            foe = returnLeft(foe);
        }
    }
}
