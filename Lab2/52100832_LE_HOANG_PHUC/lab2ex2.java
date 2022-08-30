public class lab2ex2 {
   public static int findMin(int arr[]) {
      int min = arr[0];
      for(int i=0;i<arr.length;i++){
         if(arr[i] <= min){
            min = arr[i];
         }
      }
      return min;
   }
   public static void main(String[] args) {
      int[] numberArr = {12 , -4, 10, 4, 4, -2, -6};
      System.out.print("Min is " + findMin(numberArr)); 
   }
}
