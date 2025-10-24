import java.util.Scanner;

class bankBalanceProgram2{
   public static void main(String[]args){
   
      final double INTEREST_RATE = 0.03;
      Scanner scn = new Scanner(System.in);
      
      System.out.print("Please enter the initial bank balance: ");
      double balance = scn.nextDouble();  
      
      System.out.print("Do you wanna see next year's balance?" + 
                        "\nEnter 1 if yes and any number if no: ");
      int choice = scn.nextInt();  
      
      do{
         balance += (balance * INTEREST_RATE);         
         System.out.print("After 1 year at 3% interest rate, the balance is $" + balance);
         
         System.out.print("\n\nDo you want to see the balance at the end of another year?" + 
                        "\nEnter 1 if yes and any number if no: ");
         choice = scn.nextInt();
      }
      while(choice == 1);
   }
}