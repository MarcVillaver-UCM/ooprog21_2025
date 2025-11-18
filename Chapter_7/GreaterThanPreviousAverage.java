public class GreaterThanPreviousAverage {
   public static int GreaterThanPreviousAverage(int[] arr) {
      if (arr == null || arr.length <= 1) return 0;

      long sum = arr[0];
      int prevCount = 1; 
      int result = 0;

      for (int i = 1; i < arr.length; i++) {
         double avg = (double) sum / prevCount;
         if (arr[i] > avg) result++;
         sum += arr[i];
         prevCount++;
      }
      return result;
   }

   public static void main(String[] args) {
      int[] responseTimes = {100, 200, 150, 300};
      System.out.println(GreaterThanPreviousAverage(responseTimes));
   }
}
