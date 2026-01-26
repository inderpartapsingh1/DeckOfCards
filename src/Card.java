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
        if (value == 14) { this.faceValue = "A";}
            else if (value == 13) { this.faceValue = "K";}
            else if (value == 12) { this.faceValue = "Q";}
            else if (value == 11) { this.faceValue = "J";}
            else{faceValue = String.valueOf(value);}
            
    }
    
    
    public static ArrayList<Card> DeckOfCards(){
        ArrayList<Card> DeckOfCards = new ArrayList<>(51);
        int value = 2;
        while (value != 15){
            
            
            
            
            Card s =  new Card("Spade",value);
            s.setFaceValue(value);
            DeckOfCards.add(s);
            
            Card h =  new Card("Heart",value);
            h.setFaceValue(value);
            DeckOfCards.add(h);
            
            Card c =  new Card("Clubs",value);
            c.setFaceValue(value);
            DeckOfCards.add(c);

            Card d =  new Card("Diamonds",value);
            d.setFaceValue(value);
            DeckOfCards.add(d);
            value = value+1;
        }

        return DeckOfCards;
    }

}
