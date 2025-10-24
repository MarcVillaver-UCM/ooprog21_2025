// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;
public class DebugSix1{
   public static void main(String args[]){
   
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;
   
      System.out.print("Enter number of days >> ");//missing semicolon at the end of this line
      days = keyboard.nextInt();

      while(days >= day){//wrong condition, it should be "days >= day", not "days < day" for the loop to run if the user inputs a value greater than 1.
         money *= 2;// changed from "money = 2 * money;" to "money *= 2" to make it cleaner.
         System.out.println("After day " + day + " you have " + money);
         ++day;//move the incrementation here
      }
   }
}
