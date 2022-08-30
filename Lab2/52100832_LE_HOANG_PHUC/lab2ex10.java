public class lab2ex10 {
   public static void sort(int arr[]) {
      for(int i = 0; i<arr.length-1;i++){
         int index=i;
         for(int j = i+1;j<arr.length;j++){
            if(arr[j] >= arr[index]){
               index = j;
               //System.out.println(index);
            }
         }
         int swap = arr[i];
         arr[i] = arr[index];
         arr[index] = swap;
      }
      int i = 0;
      while( i < 3){
         System.out.println(arr[i]);
         i++;
      }
   }
   public static void main(String[] args) {
      int[] numberArr = {2,5,7,4,10,8};
      System.out.print("The third largest element in an array is\n");
      sort(numberArr);
   }
}
