package Lab2;

import java.math.BigDecimal;

public class Lab2_ex1 {
   public static int findMax(int arr[]) {
      int next = arr[0];
      for(int i=0;i<arr.length;i++){
         if(arr[i] >= next){
            next = arr[i];
         }
      }
      return next;
   }
   public static int findMin(int arr[]) {
      int next = arr[0];
      for(int i=0;i<arr.length;i++){
         if(arr[i] <= next){
            next = arr[i];
         }
      }
      return next;
   }
   public static int Sumeven(int arr[]) {
      int sum = 0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]%2 == 0){
            sum += arr[i];
         }
      }
      return sum;
   }
   public static int Count(int arr[]) {
      int count = 0;
      for(int i=0;i<arr.length;i++){
            count+=1;
         }
      return count;
   }
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
      for ( int i: arr){
         if(Pali(arr[i]) == 1){
            count++;
         }
      }
      return count;
   }
   public static int findindex(int arr[], int k) {
      for ( int i: arr){
         if(arr[i] == k){
            return i+1;
         }
      }
      return -1;
   }
   public static int[] square(int arr[]) {
      for (int i: arr){
         arr[i] = (int) Math.pow(arr[i],2);
         }
      return arr;
      }
   public static BigDecimal findMax(BigDecimal []arr){
      BigDecimal max = arr[0];
      for(int i = 0; i< arr.length ;i++){
         if(max.compareTo(arr[i])){
            max = arr[i];
         }
      }
      return max; 
   }
   public static void main(String[] args) {
      int[] arr = {1,5,3,7,8,3,8,9,2};
      System.out.print(findMax(arr)); 
   }
}