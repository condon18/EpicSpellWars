package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import java.util.Random;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class MindAltering extends CardNode {
    protected MindAltering() {
        super(6, 0, 2, -1, SCHOOL.ILLUSION);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int numPlayers = returnNumPlayers(myCasterNum);

        Random rand = new Random();
        int foe = rand.nextInt(numPlayers);

        damage(foe, 3);

        // Treasure card
    }
}
