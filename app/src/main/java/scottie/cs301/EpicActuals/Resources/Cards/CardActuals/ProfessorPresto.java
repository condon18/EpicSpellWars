package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import java.util.Random;

import scottie.cs301.EpicActuals.Resources.Info.GameStateActual;

/**
 * Created by mukai18 on 4/12/2016.
 */
public class ProfessorPresto extends CardNode {
    protected ProfessorPresto() {
        super(8, 0, 1, -1, SCHOOL.ARCANE);
    }

    @Override
    public void resolve(GameStateActual currentState, int[] spell, int myCasterNum) {
        int numPlayers = returnNumPlayers(myCasterNum);

        Random rand = new Random();
        int foe = rand.nextInt(numPlayers);

        damage(foe, 3);

        // Treasure if used WIld Magic Card
    }
}
