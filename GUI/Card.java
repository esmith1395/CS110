/* Ellie Smith
CS 110
Homework 5 */

/* Card class - creates a new playing card */

public class Card
{
   static final int SPADES = 0;
   static final int DIAMONDS = 1;
   static final int HEARTS = 2;
   static final int CLUBS = 3;
   static final int lowestCard = 2;
   static final int ACE = 14;
   static final int KING = 13;
   static final int QUEEN = 12;
   static final int JACK = 11;
   private int rank;
   private int suit;
   
   //Creates a new playing card
   public Card(int rank, int suit)
   {
      this.rank = rank;
      this.suit = suit;
   }
   
   /** getSuit - returns the suit 
   @return suit*/
   public int getSuit()
   {
      
      return suit;
   }
   
   /** getRank - returns the rank
   @return rank */
   public int getRank()
   {
      return rank;
   }
   
   public String toString()
   {
      String suitString;
      String rankString;
      
      if (suit == DIAMONDS)
         suitString = "diamonds";
      else if (suit == HEARTS)
         suitString = "hearts";
      else if (suit == SPADES)
         suitString = "spades";
      else 
         suitString = "clubs";
         
      if (rank == ACE)
         rankString = "Ace";
      else if (rank == 2)
         rankString = "2";
      else if(rank == 3)
         rankString = "3";
      else if (rank == 4)
         rankString = "4";
      else if (rank == 5)
         rankString = "5";
      else if(rank == 6)
         rankString = "6";
      else if(rank == 7)
         rankString = "7";
      else if (rank == 8)
         rankString = "8";
      else if (rank == 9)
         rankString = "9";
      else if (rank == 10)
         rankString = "10";
      else if (rank == JACK)
         rankString = "Jack";
      else if (rank == QUEEN)
         rankString = "Queen";
      else 
         rankString = "King";
      
      String str = rankString + " of " + suitString;
      
      return str;   

   }
   
   /** equals - determines if two card ranks are the same
   @returns status True if they are equal, false if they aren't*/
   public boolean equals(Card otherCard)
   {
      boolean status;
      
      if(otherCard.getRank() == rank)
         status = true;
      else
         status = false;
      
      return status;
   }
}