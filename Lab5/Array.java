import java.util.Scanner;

public class Array {
   public static int maxEven(int[] a) {
      int max = a[0];
      for(int i = 0;i<a.length;i++){
         if(a[i]%2== 0 && a[i] > max){
            max = a[i];
         }
      }
      if(max == a[0]){
         if(a[0]%2 == 0){
            return a[0];
         }
         else{
            return 0;
         }
      }
      return max;
   }
   public static int minOdd(int[] a) {
      int min = a[0];
      for(int i = 0;i<a.length;i++){
         if(a[i]%2 != 0 && a[i] < min){
            min = a[i];
         }
      }
      if(min == a[0]){
         if(a[0]%2 != 0){
            return a[0];
         }
         else{
            return 0;
         }
      }
      return min;
   }
   public static int sumMEMO(int[] a) {
      return maxEven(a) + minOdd(a);
   }
   public static int sumEven(int[] a) {
      int sum = 0;
      for(int i = 0;i<a.length;i++){
         if(a[i]%2 == 0){
            sum += a[i];
         }
      }
      return sum;
   }
   public static int prodOdd(int[] a) {
      int pro = 1;
      for(int i = 0; i<a.length;i++){
         if(a[i]%2 != 0){
            pro*=a[i];
         }
      }
      if(pro == 1){
         return 0;
      }
      return pro;
   }
   public static int idxFirstEven(int[] a) {
      for(int i =0;i<a.length;i++){
         if(a[i]%2 == 0){
            return i+1;
         }
      }
      return -1;
   }
   public static int idxLastOdd(int[] a) {
      for(int i = a.length-1;i>=0;i--){
         if(a[i] %2 != 0){
            return i+1;
         }
      }
      return -1;
   }
   public static int[] input(int n) {
      int[] a = new int[n];
      Scanner ele = new Scanner(System.in);
      int i = 0;
      while(i<n){
         System.out.printf("\nNhap phan tu thu %d : ",i+1);
         a[i] = ele.nextInt();
         i++;
      }
      ele.close();
      return a;
   }

   public static void main(String[] args) {
      int n = 5;
      int[] Arr = new int[10];
      Arr = input(n);
      System.out.println(maxEven(Arr));
      System.out.println(minOdd(Arr));
      System.out.println(sumMEMO(Arr));
      System.out.println(prodOdd(Arr));
      System.out.println(idxFirstEven(Arr));
      System.out.println(idxLastOdd(Arr));
   }
}
