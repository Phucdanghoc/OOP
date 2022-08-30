public class lab2ex7 {
   public static void square(int arr[]) {
      for (int i = 0;i<arr.length;i++){
         arr[i] = (int) Math.pow(arr[i],2);
         System.out.printf("Arr[%d] = %d\n",i,arr[i]);
         }
      
      }
      public static void main(String[] args) {
         int[] numberArr = {1 , -4, 10, 4, 9, -2, -6, 5 , 7, 71};
         System.out.println("Squared array from old array is ");
         square(numberArr);
      }
}
