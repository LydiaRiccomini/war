package war1;

 
 

public class War {

       public static void main(String[] args) {
           Card[][] hands = new Card[2][1];
           Deck myDeck = new Deck();
          
         int y = 0;
         int z = 0;

           for (int i = 0; i < 26; i++)
           {

        	   for (int player = 0; player < hands.length; player++)
        		   hands[player][0] = myDeck.dealCard();
 
               for (int player = 0; player < hands.length; player++) {
               }

               Integer player1 = hands[0][0].getValue();
               Integer player2 = hands[1][0].getValue();
               if (player1 > player2) {
                    y++;}
               if (i == 25 & y > z) {
                    System.out.println("Player 1 wins!! with " + y + " victories");
               }


               else if (player2 > player1) {
                    z++;
               }
               if (i == 25 & z > y) {
                    System.out.println("Player 2 wins!! with " + z + " Victories!" );
                    }
               if (i == 25 & player1 == player2) {
            	   System.out.println("players have tied!");
               }
          

           }

}


   public static void printHand(Card[] hand) {

   for (int card = 0; card < hand.length; card++);
   }

}