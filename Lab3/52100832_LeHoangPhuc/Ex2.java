import java.util.Scanner;
public class Ex2 {
   // add matrix
   public static void AddMaxtric(int Arr[][],int column, int row) {   
      Scanner add = new Scanner(System.in);
      for(int i = 0;i < row;i++){
         for(int j = 0;j< column;j++){
            System.out.printf("A[%d][%d] = ",i+1,j+1);
            Arr[i][j] = add.nextInt();
         }
      }
      add.close();
   }
   // Mul matrix
   public static int[][] Mul(int Arr[][],int number,int column, int row) {
      for(int i = 0;i < row;i++){
         for(int j = 0;j< column;j++){
            Arr[i][j] = Arr[i][j]*number;
         }
      }
      return Arr;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the column = ");
      int column = sc.nextInt();
      System.out.print("Enter the row = ");
      int row = sc.nextInt();
      int Arr[][] = new int[row][column];
      AddMaxtric(Arr, column, row);
      System.out.print("Enter the numver to mul = ");
      int number = sc.nextInt();
      for(int[] i:Mul(Arr,number,column,row)){
            for(int k:i){
               System.out.printf("%d\t",k);
            }
            System.out.println();
      }
      sc.close();
   }   
}