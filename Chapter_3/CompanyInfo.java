class CompanyInfo{
   public static void main(String[] args){
         
      System.out.println("Smart Electronics");
      displayHours();    
   }
   public static void displayHours(){
      String message = ("Monday - Friday 8 am to 6 pm \n" +
                        "Saturday        8 am to noon \n" + 
                        "Sunday          closed");
      System.out.println(message);
   }
}