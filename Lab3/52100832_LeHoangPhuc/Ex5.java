import java.util.Scanner;
public class Ex5 {
   public static boolean SearchDup(String[] input,String temp,int pos) {
      for(int a = 0;a<pos;a++){
         if(input[a].equals(temp) == true){
            return false;
         }
      }
      return true;
   }
   public static void Count(String mess) {
      String string[] = mess.split(" ");
      // Đếm 
      int countdup = 0;
      for(int a = 0;a<string.length;a++){
         countdup++;
         if(SearchDup(string,string[a],a) == false){
            countdup--;
         }
      }
         //System.out.println(countdup);
      
      String[][] Result = new String[2][countdup];
      int count;
      for(int i = 0;i < string.length;i++){
         count = 0;
         for(int j = i;j < string.length;j++){
            if(SearchDup(string,string[i],i) == false){
               break;
            }
            if(string[i].equals( string[j]) == true){
               count++;
            }
         }
         if(count > 0){
            Result[0][i] = string[i];
            Result[1][i] = String.valueOf(count);
         }
      }  
      int i = 0;    
      while(i<countdup){
         System.out.printf("'%s' , %s\n",Result[0][i],Result[1][i]);
         i++;
      }
}
   public static void main(String[] args) {
      Scanner mess = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String string = mess.nextLine();
      Count(string);
      mess.close();
   }
}
