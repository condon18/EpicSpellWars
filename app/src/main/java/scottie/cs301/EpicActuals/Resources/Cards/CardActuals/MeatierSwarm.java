package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MeatierSwarm extends CardNode {
    protected MeatierSwarm() {
        super(30, 20, 3, -1, SCHOOL.ELEMENTAL);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        // find each of your strongest foes

        int roll = rollPower(spell, 30);

        if(roll <= 4) {
            damage(foe, 1);
        }
        else if(roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe,4);
        }
    }
}
