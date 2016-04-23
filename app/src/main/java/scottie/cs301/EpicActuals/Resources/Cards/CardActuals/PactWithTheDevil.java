package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class PactWithTheDevil extends CardNode {
    protected PactWithTheDevil() {
        super(33, 18, 3, -1, SCHOOL.DARK);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnStrongest(myCasterNum);

        int roll = rollPower(spell, 33);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 2);
        }
        else {
            damage(foe,2);
            // if he has delivery- steal and resolve as part of your spell
        }
    }
}
