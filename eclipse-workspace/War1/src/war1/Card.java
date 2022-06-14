package war1;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {
       private int cardNum;
    final static List<String> suits = List.of("Spades", "Hearts", "Diamonds", "Clubs");
    final static List<String> value = List.of("2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace");
    public void shuffle() {
        {
      	   Collections.shuffle(value);
      	   Collections.shuffle(suits);}
        
        }
    public Random random = new Random(1-13);

    Card (int theCard) {
        setCardNum (theCard);
    }

    public void setCardNum (int theCard) {
        cardNum = (theCard >= 0 && theCard <= 51)? theCard: 0;
    }

    public int getCardNum() {
        return cardNum;
    }

 

    public String toString() {
        return value + " of " + suits;
    }

    public List<String> getSuit() {
        return suits;
    }

    public List<String> getRank() {
        return value;
    }

    public int getValue() {
        return cardNum%13;
        }

 

}