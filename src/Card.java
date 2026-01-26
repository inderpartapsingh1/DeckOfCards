import java.util.ArrayList;

public class Card {
    String suit ;
    int value ;
    String faceValue ;
    public  Card(String suit,int value){
        this.suit = suit;
        this.value = value;
        
        
    }
    public void setFaceValue(int value){
        if (value == 14) { this.faceValue = "Ace";}
            else if (value == 13) { this.faceValue = "King";}
            else if (value == 12) { this.faceValue = "Queen";}
            else if (value == 11) { this.faceValue = "Jack";}
            else{faceValue = String.valueOf(value);}
            
    }
    
    
    public static ArrayList<Card> DeckOfCards(){
        ArrayList<Card> DeckOfCards = new ArrayList<>(52);
        String [] suits = {"Spades","Heart","Diamonds","Clubs"};

        for (String suit : suits ){
        
            
            for (int value = 2; value <= 14; value++){

                Card card =  new Card(suit,value);
                card.setFaceValue(value);
            DeckOfCards.add(card);

            }
            
             
        }

        return DeckOfCards;
    }

}
