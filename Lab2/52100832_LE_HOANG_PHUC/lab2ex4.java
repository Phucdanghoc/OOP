public class lab2ex4 {
   public static int Count(int arr[]) {
      int count = arr.length;
      return count;
   }
   public static void main(String[] args) {
      int[] numberArr = {1 , -4, 10, 4, 9, -2, -6};
      System.out.print("The number of elements in the array is " + Count(numberArr)); 
   }
}
