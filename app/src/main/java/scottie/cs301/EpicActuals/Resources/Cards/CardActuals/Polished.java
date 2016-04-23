package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Polished extends CardNode {
    protected Polished() {
        super(35, 0, 2, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnStrongest(myCasterNum);

        int roll = rollPower(spell, 35);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 2);
            // you gain Treasure
        }
        else {
            damage(foe,5);
            // you gain Treasure
        }
    }
}
