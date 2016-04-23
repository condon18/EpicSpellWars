package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class VorpalTrap extends CardNode {
    protected VorpalTrap() {
        super(41, 13, 3, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = returnLeft(myCasterNum);

        int roll = rollPower(spell, 41);

        if(roll <= 4) {
            damage(foe, 2);
        }
        else if(roll <= 9) {
            damage(foe, 3);
        }
        else {
            damage(foe,3);

            String[] choice = {"Destroy a Treasure", "Suffer Additional 3 Points Damage"};
            int choose = sendChoice(choice);

            if (choose == 0) {
                // destroy Treasure
            }
            else {
                damage(foe,3);
            }
        }
    }
}
