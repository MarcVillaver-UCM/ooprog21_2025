import java.util.Scanner;
class BankBalanceByRateAndYear{
   public static void main(String []args){
      
      double INTEREST_RATE = 0.02;
      Scanner scn = new Scanner(System.in);
      
      System.out.print("Enter initial bank balance: ");
      double initialBalance = scn.nextDouble();
      
      for(double i = INTEREST_RATE; i <=0.05; i+=0.01){
         double balance = initialBalance;
         System.out.print("\nWith an initial balance of $" + balance +
                              " at an interest rate of " + i +"\n");
         for(int j = 1; j<=4; j++){
            balance += (i * balance);
            System.out.println("After year " + j +", balance is at $" + balance);
         }
      }
   }
}