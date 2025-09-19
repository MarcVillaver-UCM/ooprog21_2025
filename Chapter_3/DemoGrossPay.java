class DemoGrossPay{
   public static void main(String[] args){
   
      double hours1 = 10.0;
      double hours2 = 25.0;
      double hours3 = 37.5; 
    
      calculateGross(hours1);
      calculateGross(hours2);
      calculateGross(hours3);
   }

   public static void calculateGross(double hours) {
      double grossPay = hours * 22.75;
      System.out.println(hours + " hours at $22.75 per hour is $" + grossPay);   
   }
}