import java.util.Scanner;
public class Ex4 {
   // Find the length of the string.
   public static int  lenghString(String string) {
      return string.length();
   }
   // Count the number of words in string.
   public static int Word(String string) {
      
      String[] len = string.split(" ");
      return len.length;
   }
   // Concatenate one string’s contents to another
   public static String Contact(String string) {
      Scanner newString = new Scanner(System.in);
      System.out.print("Enter new String : ");
      String addstr = newString.nextLine();
      newString.close();
      return string + " " + addstr;
   }  
   // Check if a string is palindrome or not
   public static Boolean checkpal(String string) {
      char[] pal = string.toCharArray();
      if(pal.length <= 1){
         return false;
      }
      for(int i = 0; i < pal.length/2;i++){
         if(pal[i]  != pal[pal.length - 1 - i]){
            return false;
         }
      }
      return true;
   }
   public static void main(String[] args) {
      Scanner mess = new Scanner(System.in);
      System.out.print("Enter the String: ");
      String string = mess.nextLine();
      System.out.printf("The length of the string is %d\n",lenghString(string));
      System.out.printf("The number of words in string is %d\n",Word(string));
      System.out.println(Contact(string));
      if(checkpal(string) == true ){
         System.out.println(string + " is palindrome ");
      }
      else{
         System.out.println(string + " is not palindrome ");
      }   
      mess.close();
   }
}
