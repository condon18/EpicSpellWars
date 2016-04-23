package scottie.cs301.EpicActuals.Resources.Cards;

/**
 * Created by Zimmerms18 on 3/30/2016.
 *
 * For use in Epic Spell Wars cs301 class project.
 * Team 5: Scott Zimmerman, Markus Perry, Liz Mukai, Teresa Condon
 *
 * Deck object as a simple container for Card objects.
 * Done so that LocalGameActual can have a static final array of cards.
 * So a card may be accessed by LocalGameActual.DECK.theDeck[cardID].
 */
public class Deck
{
    public static final Card[] theDeck = null; //static array of cards

    public Deck() {} //this will build and assign each of the 52 instances of the card subclasses
}
