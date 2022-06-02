/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Shehreen kaur
// Student number  991665404

package cardtrickice1;

import java.util.Scanner;
import java.lang.Math;


/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        
        System.out.println("cards of magic hands are :");
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
          //   c1.setValue(2);
            c1.setValue((int) (Math.random()*13+1 ));      //use a method to generate random *13
            c1.setSuits("hearts");  //random method suit
           
         //   c1.setSuits(Math.random()*4);
            magicHand[i] =c1;
            System.out.println(c1);
                    
        }
        //step 2:take input 
         Scanner in = new Scanner(System.in);
            System.out.println("Pick choose the suit: ");
               String suit = in.nextLine();
            System.out.println("Please choose the value(1 to 12): ");
                int number = in.nextInt();
                
             Card one = new Card();
              one.setValue(number);
              one.setSuits(suit);
              
              one.setValue(11);
              one.setSuits("spades");
                boolean item = false;
                System.out.println(one);
                  for(int i=0; i<magicHand.length; i++) 
                  {
                      if((magicHand[i].getValue() == one.getValue()) && magicHand[i].getSuits().equals(one.getSuits())) {
                          System.out.println("card is found at this plce: "+ (i+1));
                           item=true;
                           break;
                      }
                  }
       
        //step 3: match with array 
              if(!item) 
                  System.out.println("Sorry, no match.");
                  
        }  
    }
