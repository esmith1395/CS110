import java.util.ArrayList;
import javax.swing.*;

public class War
{
   //public static void main(String[] args)
  
   final int HALF = 26;
   final int EMPTY = 0;
   final int TOP_CARD = 0;
   ArrayList<Card> holder = new ArrayList<Card>();       //holds cards if there is a war
      
               
    //Create ArrayLists to hold each player's cards
    ArrayList<Card> player1 = new ArrayList<Card>();
    ArrayList<Card> player2 = new ArrayList<Card>();
      
      /** Constructor
      deals the cards */
      public War()
      {
         //Create a new deck and shuffle it
         Deck deck = new Deck();
         deck.shuffle();

         
         //Split the deck
         while(!(deck.isEmpty()))
         {
            for(int i = 1; i <= HALF; i++)
            {
               player1.add(deck.dealCard());
               player2.add(deck.dealCard());
            }
         }
      }
      
      public void round()
      {
      
      Card card1 = player1.get(player1.size() - 1);
      Card card2 = player2.get(player2.size() - 1);    
     
      //Determine neither deck is empty
      while(player1.size() != EMPTY && player2.size() != EMPTY || card1.getRank() == card2.getRank())
      {
         try
         {
            card1 = player1.get(player1.size() - 1);
            player1.remove(card1);
            card2 = player2.get(player2.size() - 1);
            player2.remove(card2);
            
                        
            if(card1.getRank() < card2.getRank())
            {
               player2.add(0, card1);
               player2.add(0, card2);
               System.out.println("Player 2 won this round");
               
               //if there is any cards in the hold array
               while(holder.size() != EMPTY)
               {
                  Card switchCard = holder.get(TOP_CARD);
                  holder.remove(TOP_CARD);
                  player2.add(switchCard);
               }
            }
            else if (card1.getRank() > card2.getRank())
            {
               player1.add(0, card2);
               player2.remove(card2);
               player1.add(0, card1);
               System.out.println("Player 1 won this round");
   
               
               //if there are any cards in teh hold array
               while(holder.size() != EMPTY)
               {
                  Card switchCard = holder.get(TOP_CARD);
                  holder.remove(TOP_CARD);
                  player1.add(switchCard);
               }  
            }
            else if(card1.getRank() == card2.getRank())
            {
                 System.out.println("WAR");
                 
                 //hold cards in holder array
                 holder.add(card1);
                 holder.add(card2);
                 
                 //get next cards
                 Card card3, card4;
                 
                 card3 = player1.get(TOP_CARD);
                 player1.remove(TOP_CARD);
                 card4 = player2.get(TOP_CARD);
                 player2.remove(TOP_CARD);
                 
                 //add those cards to the array
                 holder.add(card3);
                 holder.add(card4);        
            }           
   
         }
         catch(Exception e)
         {
         } 
         

   }
}
   
public Card getTopCard(int playerNum)
{
      if(playerNum == 1)
      {
         Card topCard1 = player1.get(player1.size() - 1);
         return topCard1;
      }
      else if(playerNum == 2);
      {
         Card topCard2 = player2.get(player2.size() - 1);
         return topCard2;
      }
}
   
public static void main(String[] args)
{
      War game = new War();
      game.round();
}


}