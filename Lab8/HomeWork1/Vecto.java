package HomeWork1;
import java.util.Scanner;
import java.util.Vector;
public class Vecto {
   public static void main(String[] args) {
      System.out.print("Enter n :");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Vector<Integer> victor = new Vector<>(n);
      Vector<Integer> victorY = new Vector<>(n);
      for(int i=0;i<n;i++){
         System.out.printf("vector(%d): ",i+1);
         int temp =sc.nextInt();
         victor.add(temp);
         int tempY = (int) (2*Math.pow(temp, 2) + 1);
         victorY.add(tempY);
      }
      System.out.println("Reselt:");
      for(int i : victorY){
         System.out.println(i);
      }
   }

}
