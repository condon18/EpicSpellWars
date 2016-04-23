package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Bedazzlement extends CardNode {
    protected Bedazzlement(int myID, int myInit, int myPlace, int myImage, SCHOOL mySchool) {
        super(16, 19, 3, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int foe = chooseFoe(myCasterNum); // not sure for parameters

        int roll = rollPower(spell, 16);

        if(roll <= 4) {
            damage(foe,1);
        }
        else if (roll <= 9) {
            damage(foe, 1);
            // add random card from hand to spell
        }
        else {
            damage(foe, 1);
            // add card from hand to spell
        }
    }
}
