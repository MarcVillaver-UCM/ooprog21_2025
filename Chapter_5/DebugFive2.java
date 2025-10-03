// DebugFive2.java
// Decides if two numbers are evenly divisible

import java.util.Scanner;
public class DebugFive2{
   public static void main(String args[]){
      
      int num;
      int num2;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number ");
      num = input.nextInt(); //missing an open and close parenthesis after nextInt "()"
      
      System.out.print("Enter another number ");
      num2 = input.nextInt(); //missing an open and close parenthesis after nextInt "()"
      
      if((num % num2 == 0) || (num2 % num) == 0){ // we use % to check if one number divides the other evenly, and an 'OR'(||) operator so the condition is true if at least one of them is true
         System.out.println("One of these numbers is");
         System.out.println(" evenly divisible into the other");
      }

      else{ 
         System.out.println("Neither of these numbers is");
         System.out.println(" evenly divisible into the other");
      }
   }
}
