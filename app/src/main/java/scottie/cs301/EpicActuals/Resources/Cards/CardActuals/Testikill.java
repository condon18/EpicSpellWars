package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Testikill extends CardNode {
    protected Testikill() {
        super(40, 7, 3, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnWeakest(myCasterNum);

        int roll = rollPower(spell, 40);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe,5);
            //gain Treasure Card
        }
    }
}
