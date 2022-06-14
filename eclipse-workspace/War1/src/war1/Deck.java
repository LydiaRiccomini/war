package war1;

public class Deck {

       private Card[] deck = new Card[52];
           private int topCard;
           Deck() {
               topCard = 0;
               for (int i = 0; i < deck.length; i++) {
                   deck[i] = new Card(i);
           }

           
          }
           public Card dealCard() {
               Card theCard;
               if (topCard < deck.length) {
                   theCard = deck[topCard];
                   topCard++;
               }
               else
                   theCard = null; 
               return theCard;
           }

}