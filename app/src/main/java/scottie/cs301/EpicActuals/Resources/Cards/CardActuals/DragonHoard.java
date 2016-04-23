package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class DragonHoard extends CardNode {
    protected DragonHoard() {
        super(24, 6, 3, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe; // foes who have no treasures

        int roll = rollPower(spell, 24);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 2);
        }
        else {
            damage(foe,3);
            // gain Treasure Card
        }
    }
}
