package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class SirLootzor extends CardNode {
    protected SirLootzor() {
        super(15, 0, 1, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int curPlayer = returnLeft(myCasterNum);
        int[] roll;
        int index = 0;
        int die;

        while (curPlayer != myCasterNum) {
            die = rollDie(curPlayer);
            roll[index] = die;
            index++;
        }

        for (int i = 0; i < roll.length; i++) {
            // gain treasure
        }
    }
}

