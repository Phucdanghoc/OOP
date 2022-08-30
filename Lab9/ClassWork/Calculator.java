// package ClassWork;

public class Calculator {
   public static double divide(int a, int b) throws ArithmeticException{
      if(b == 0){
         throw new ArithmeticException("divide by zero");
      }
      return a/b;
   }
   public static int multiply(int a,int b) throws NumberOutOfRangeException{
      if(a*b < -1000000){
         throw new NumberOutOfRangeException("Number is outside the computation");
      }
      return a*b;
   }
   public static void main(String[] args) throws NumberOutOfRangeException,ArithmeticException {
      int a = 10000;
      int b = 1;
      System.out.println(divide(a, b));
   }
}
