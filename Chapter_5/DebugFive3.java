// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive3{
   public static void main (String args[]){

      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;

      Scanner input = new Scanner(System.in);
      System.out.print("Please enter item number >> ");
      item = input.nextInt();
      
      if(item < LOW) //it should be "item < low" instead of "item > low" to check if the item is too low 
         output = "Item number too low";  
         
      else if(item >= HIGH) //typo error before "HIGHH", fixed by naming it to "HIGH"
         output = "Item number too high";
      
      else if(item < CUTOFF) //it should be "item < CUTOFF"instead of "item == CUTOFF" in order to include all valid numbers below 500
         output = "Valid - Item in Automotive Department";
      
      else
         output = "Valid - Item in Housewares Department";
            
            System.out.println(output);
   }
}
