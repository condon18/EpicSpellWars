package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class Catastrophic extends CardNode {
    protected Catastrophic() {
        super(19, 0, 2, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int curPlayer = returnLeft(myCasterNum);
        int[] roll;
        int index = 1;
        int die;

        roll[0] = rollDie(myCasterNum) + 2;

        while (curPlayer != myCasterNum) {
            die = rollDie(curPlayer);
            roll[index] = die;
            index++;
        }

        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == 6) {
                // gain treasure
            }
            else {
                // players take damage according to roll
            }
        }
    }
}
