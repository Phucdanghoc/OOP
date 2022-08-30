import java.util.Scanner;

public class lab2ex6 {
   public static int findindex(int arr[], int k) {
      for ( int i = 0;i<arr.length;i++){
         if(arr[i] == k){
            return i+1;
         }
      }
      return -1;
   }
   public static void main(String[] args) {
      Scanner var = new Scanner(System.in);
      System.out.print("Enter k  = ");
      int k = var.nextInt();
      int[] numberArr = {1 , -4, 10, 4, 9, -2, -6};
      System.out.printf("Index of %d is  %d",k,findindex(numberArr,k)); 
      var.close();
   }
}
