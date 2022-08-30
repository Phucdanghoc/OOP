public class lab2ex1 {
   public static int findMax(int arr[]) {
      int max = arr[0];
      for(int i = 0;i<arr.length;i++){
         if(arr[i] >= max){
            max = arr[i];
         }
      }
      return max;
   }
   public static void main(String[] args) {
      int[] numberArr = {12 , -4, 10, 4, 4, -2, -6};
      System.out.print("Max is " + findMax(numberArr)); 
   }
}
