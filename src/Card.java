import java.util.ArrayList;
import java.util.Random;

public class Card {
    String suit ;
    int value ;
    String faceValue ;
    public  Card(String suit,int value){
        this.suit = suit;
        this.value = value;
        setFaceValue(value);
        
        
    }
    public void setFaceValue(int value){
        if (value == 14) { this.faceValue = "Ace";}
            else if (value == 13) { this.faceValue = "King";}
            else if (value == 12) { this.faceValue = "Queen";}
            else if (value == 11) { this.faceValue = "Jack";}
            else{faceValue = String.valueOf(value);}
            
    }
    
    
    public static ArrayList<Card> DeckOfCards(){
        ArrayList<Card> Deck = new ArrayList<>(52);
        String [] suits = {"Spades","Heart","Diamonds","Clubs"};

        for (String suit : suits ){
        
            
            for (int value = 2; value <= 14; value++){

                Card card =  new Card(suit,value);
            Deck.add(card);

            }
            
             
        }

        return Deck;
    }


    public static ArrayList<Card> shuffle(){
        ArrayList<Card> deck = Card.DeckOfCards();
        Random random = new Random();

        for (int i=  deck.size() -1; i > 0 ;i --) {   

            int j = random.nextInt(i + 1); 
            
            Card temp = deck.get(i) ;
            deck.set( i, deck.get(j) ); 
            deck.set( j , temp);

        }  
        return deck;
    }

}
