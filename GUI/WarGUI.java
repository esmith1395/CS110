import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGUI extends JFrame
{
   private final int WINDOW_WIDTH = 500;
   private final int WINDOW_HEIGHT = 500;
   private War game;

      //Create face up cards
      JLabel playCard1 = new JLabel();
      JLabel playCard2 = new JLabel();
      
            
      //create two panels
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel panel4 = new JPanel();
   
   /** constructor */
   public WarGUI()
   {
      //set the title
      setTitle("WAR CARD GAME");
      
      //set the size of hte window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      //specify an actin fo rht eclose button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Add a BorderLayout manager to the content
      setLayout(new GridLayout(1,4));
      
      //Create down cards
      ImageIcon down = new ImageIcon("back.jpg");
      JButton down1 = new JButton(down);
      JButton down2 = new JButton(down);
      
      //Create button labels
      JLabel label1 = new JLabel("Player 1");
      JLabel label2 = new JLabel ("Player 2");
      
      //Register an event listener with both buttons
      down1.addActionListener(new ButtonListener());
      down2.addActionListener(new ButtonListener());

      
      //Add labels to panels
      panel1.add(label1);
      panel3.add(label2);
      
      //Add buttons to panels
      panel1.add(down1);
      panel3.add(down2);
      
      //Add the panels to the content pane
      add(panel1);
      add(panel2);
      add(panel3);
      add(panel4);
      
      //Add action listeners to the radio buttons
      
            
      //display the window
      pack();
      setVisible(true);

      
      }
      
      
      /**flips cards when clicked on */
      private class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            //get the action command
            String actionCommand = e.getActionCommand();
            
            //flip the card
            if(actionCommand.equals("Player 1") || actionCommand.equals("Player 2"))
            {
               game.round();
               
               int playerNumber1 = 1;
               int playerNumber2 = 2;
               Card playerCard1, playerCard2;
               
               String n1 = "back.jpg";
               String n2 = "back.jpg";
               
               //get top card for player 1
               playerCard1 = game.getTopCard(1);
               
               if(playerCard1.getRank() == 2)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "2s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "2d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "2h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "2c.jpg";                  
               }
               else if(playerCard1.getRank() == 3)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "3s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "3d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "3h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "3c.jpg";                  
               }    
               else if(playerCard1.getRank() == 4)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "4s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "4d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "4h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "4c.jpg";                  
               }    
               else if(playerCard1.getRank() ==5)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "5s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "5d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "5h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "5c.jpg";                  
               }  
               else if(playerCard1.getRank() == 6)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "6s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "6d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "6h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "6c.jpg";                  
               }     
               else if(playerCard1.getRank() == 7)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "7s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "7d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "7h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "7c.jpg";                  
               } 
               else if(playerCard1.getRank() == 8)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "8s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "8d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "8h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "8c.jpg";                  
               }    
               else if(playerCard1.getRank() == 9)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "9s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "9d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "9h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "9c.jpg";                  
               }    
               else if(playerCard1.getRank() == 10)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "10s.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "10d.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "10h.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "10c.jpg";                  
               }   
               else if(playerCard1.getRank() == 11)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "jacks.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "jackd.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "jackh.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "jackc.jpg";                  
               }      
               else if(playerCard1.getRank() == 12)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "queens.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "queend.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "queenh.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "queenc.jpg";                  
               } 
               else if(playerCard1.getRank() == 13)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "kings.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "kingd.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "kingh.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "kingc.jpg";                  
               }   
               else if(playerCard1.getRank() == 14)
               {
                  if(playerCard1.getSuit() == 0)
                     n1 = "aces.jpg";
                  else if(playerCard1.getSuit() == 1)
                     n1 = "aced.jpg";
                  else if(playerCard1.getSuit() == 2)
                     n1 = "aceh.jpg";
                  else if(playerCard1.getSuit() == 3)
                     n1 = "acec.jpg";                  
               }  
               
               //get top card for player2
               playerCard2 = game.getTopCard(2);
               
               if(playerCard2.getRank() == 2)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "2s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "2d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "2h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "2c.jpg";                  
               }
               else if(playerCard2.getRank() == 3)
               {
                  if(playerCard1.getSuit() == 0)
                     n2 = "3s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "3d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "3h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "3c.jpg";                  
               }    
               else if(playerCard2.getRank() == 4)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "4s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "4d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "4h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "4c.jpg";                  
               }   
               else if(playerCard2.getRank() ==5)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "5s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "5d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "5h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "5c.jpg";                  
               }  
               else if(playerCard2.getRank() == 6)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "6s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "6d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "6h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "6c.jpg";                  
               }     
               else if(playerCard2.getRank() == 7)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "7s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "7d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "7h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "7c.jpg";                  
               } 
               else if(playerCard2.getRank() == 8)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "8s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "8d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "8h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "8c.jpg";                  
               }    
               else if(playerCard2.getRank() == 9)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "9s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "9d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "9h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "9c.jpg";                  
               }    
               else if(playerCard2.getRank() == 10)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "10s.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "10d.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "10h.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "10c.jpg";                  
               }   
               else if(playerCard2.getRank() == 11)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "jacks.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "jackd.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "jackh.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "jackc.jpg";                  
               }      
               else if(playerCard2.getRank() == 12)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "queens.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "queend.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "queenh.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "queenc.jpg";                  
               } 
               else if(playerCard2.getRank() == 13)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "kings.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "kingd.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "kingh.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "kingc.jpg";                  
               }   
               else if(playerCard1.getRank() == 14)
               {
                  if(playerCard2.getSuit() == 0)
                     n2 = "aces.jpg";
                  else if(playerCard2.getSuit() == 1)
                     n2 = "aced.jpg";
                  else if(playerCard2.getSuit() == 2)
                     n2 = "aceh.jpg";
                  else if(playerCard2.getSuit() == 3)
                     n2 = "acec.jpg";                  
               }   
               
               //set images
               ImageIcon image1 = new ImageIcon(n1);
               ImageIcon image2 = new ImageIcon(n2);
               
               JLabel playCard1 = new JLabel(image1);
               JLabel playCard2 = new JLabel(image2);  
               
               //add to panels
               panel2.add(playCard1);
               panel4.add(playCard2);                        
            }   
         }
      }


   public static void main(String[]  args)
   {
      new WarGUI();
   }

}