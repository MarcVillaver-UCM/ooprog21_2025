// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
public class DebugThree1{
   public static void main(String args[]){//the syntax (String args[]) is valid but the standard is (String[] args)
   
      double check1;
      double check2;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble();//the syntax should be input.nextDouble(), not inputnextInt();
      
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble();//the syntax should be input.nextDouble(), not inputnextInt();
      
      calcTip(check1);
      calcTip(check2);
   }
   
   public static double calcTip(double bill){// this method should return to double not void and the parameter should not be empty it should have a parameter for the bill amount

      final double RATE = 0.15;//double is misspelled to doubel
      double tip;
      tip = bill * RATE;//mathmatical operation should be multiply, not divide
   
      System.out.println("The tip should be at least $" + tip);
      return tip; //missing return statement
   }
}
