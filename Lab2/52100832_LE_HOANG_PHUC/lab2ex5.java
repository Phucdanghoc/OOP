public class lab2ex5 {
   public static int Pali(int n) {
      int count = 2,pal = 0;
      while(count <= n){
         if(n%count == 0){
            pal += 1;
         }
         count++;
      }
      return pal;
   }
   public static int coutnpal(int arr[]) {
      int count  = 0;
      for (int i = 0;i<arr.length;i++){
         if(arr[i] < 1){
            continue;
         }
         if(Pali(arr[i]) == 1){
            count++;
         }
      }
      return count;
   }
   public static void main(String[] args) {
      int[] numberArr = {1 , -4, 10, 4, 9, -2, -6, 5 , 7, 71};
      System.out.print("The number of primes in the array is " + coutnpal(numberArr)); 
   }
}
