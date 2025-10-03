// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4{
   public static void main (String args[]){

      int one, two, three, four;
      int highest;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter an integer >> ");
      one = input.nextInt();

      System.out.print("Enter an integer >> ");
      two = input.nextInt(); //variable used to assign must be 'two' instead of 'one'

      System.out.print("Enter an integer >> ");
      three = input.nextInt(); //variable used to assign must be 'three' instead of 'one'

      System.out.print("Enter an integer >> ");
      four = input.nextInt(); //variable used to assign must be 'four' instead of 'one'

      if(one > two && one > three && one > four)
      highest = one;

      else if(two > one && two > three && two > four) // use '&&' instead of '||' to ensure all conditions must be true
         highest = two;
            
      else if(three > one && three > two && three > four) // removed 'three == one' since it's unnecessary
         highest = three;
         
      else
         highest = four;
               
      System.out.println("The highest number is " + highest);
   }
}
