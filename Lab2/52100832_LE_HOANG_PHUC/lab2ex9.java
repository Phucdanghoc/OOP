import java.util.Scanner;

public class lab2ex9 {
   public static int[] divisibleNumbers(int arr[],int k) {
      int count = 0;
      for(int i = 0; i < arr.length;i++){
         if(arr[i]%k == 0){
            count++;
         }
      }
      int temp = 0;
      int newArr[] = new int[count];
      for(int i = 0; i < arr.length;i++){
         if(arr[i]%k == 0){
            newArr[temp++] = arr[i];
         }
      }
      return newArr;
   }
   public static void printArr(int arr[]) {

      for(int i = 0;i<arr.length;i++){
         System.out.printf("Arr[%d] = %d\n",i,arr[i]);
      }
   }
   public static void main(String[] args) {
     int[] Arr  = {1,4,65,7,8,-2,7,2,-9,-1};
     Scanner var = new Scanner(System.in);
     System.out.print("Enter k = ");
     int k = var.nextInt();
     System.out.printf("Array divisible by %d",k);
     printArr((divisibleNumbers(Arr, k)));  
     var.close();
   }

}
