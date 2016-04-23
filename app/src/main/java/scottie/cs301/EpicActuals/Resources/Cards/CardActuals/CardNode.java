package scottie.cs301.EpicActuals.Resources.Cards.CardActuals;

import java.util.Random;

import scottie.cs301.EpicActuals.Resources.Cards.Card;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * This is a middleman layer object.
 * Common methods or effort saving methods may be added here.
 */
public abstract class CardNode extends Card
{
    protected CardNode(int myID, int myInit, int myPlace, int myImage, SCHOOL mySchool)
    {super(myID, myInit, myPlace, myImage, mySchool);} //Move along; move along.
}
//
//    public int countGlyphs(Card[] spell, int glyphType) {
//        int count = 0;
//        for (int i = 0; i < spell.length; i++) {
//            if (spell[i].schoolType. == glyphType) {
//                count++;
//            }
//        } return count;
//
//}
//public int chooseFoe(int playerID){
//    int foe = playerID;
//    while (foe == playerID) {
//        Random random = new Random();
//        foe = random.nextInt(numPlayers);
//    }
//    return foe;
//}
//    public int hasPlayers(int playerID){
//        int count = 0;
//        for (int i = 0; i < numPlayers; i++) {
//            if (playOrder(i, card.i.init) < playOrder(playerID)) {
//                count++;
//            }
//        } return count;
//
//    }
}