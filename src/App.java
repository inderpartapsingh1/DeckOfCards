import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Card> deck = Card.DeckOfCards();
        System.out.println("All Cards in a fresh deck");
        for (Card c : deck) {    
        System.out.println(c.faceValue + " of "+ c.suit);
        }


        ArrayList<Card> ShuffledDeck = Card.shuffle();
        System.out.println("\nShuffled deck:");  
        for (Card c : ShuffledDeck) {    
        System.out.println(c.faceValue + " of "+ c.suit);
        }
         
        
    
}
}
