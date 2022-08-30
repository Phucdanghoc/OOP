public class lab2ex3 {
   public static int Sumeven(int arr[]) {
      int sum = 0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]%2 == 0){
            sum += arr[i];
         }
      }
      return sum;
   }
   public static void main(String[] args) {
      int[] numberArr = {1 , -4, 10, 4, 9, -2, -6};
      System.out.print("Sum of even number in Array is " + Sumeven(numberArr)); 
   }
}
