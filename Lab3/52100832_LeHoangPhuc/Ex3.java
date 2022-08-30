import java.util.Scanner;
public class Ex3 {
   public static String  Midname(String fullname) {
      String[] Mid = fullname.split(" ");
      if(Mid.length == 1){
        return Mid[0];
      }
      String mid = "";
      for(int i=0;i<Mid.length;i++){
         if(i ==0 || i == Mid.length-1){
            continue;
         }
         mid += (Mid[i]) + " ";
      }
      return mid;
   }
   public static String First_Last(String fullname) {
      String[] Fis_Las = fullname.split(" ");
      String fis_las = Fis_Las[0] + " " + Fis_Las[Fis_Las.length-1]; 
      return fis_las;
   }
   public static String capital(String fullname) {
      String[] upString = fullname.split(" ");
      char[] temp;
      String result = "";
      String Result = "";
      for(int i = 0;i<upString.length;i++){
         temp = upString[i].toCharArray();
         temp[0] = Character.toUpperCase(temp[0]);
         result = String.valueOf(temp);
         Result += result + " " ;
      }
      return Result;
   }
   public static String Up_low(String fullname) {
     // String[] string = fullname.split(" ");
      char[] temp = fullname.toCharArray();
      for(int i = 0;i<temp.length;i++){
         if(temp[i] == 'u' || temp[i] == 'i' || temp[i] == 'a' || temp[i] == 'o'|| temp[i] == 'e' || temp[i] =='y'){
            temp[i] = Character.toUpperCase(temp[i]);
         }
         else if(temp[i] == ' '){
            continue;
         }
         else{
            temp[i] = Character.toLowerCase(temp[i]);
         }
      }
      return String.valueOf(temp);
   }
   public static void main(String[] args) {
      Scanner name = new Scanner(System.in);
      System.out.println("Enter full name");
      String fullname = name.nextLine();
      System.out.println(Midname(fullname));
      System.out.println(First_Last(fullname));
      System.out.println(capital(fullname));
      System.out.println(Up_low(fullname));
      name.close();
   }
}
