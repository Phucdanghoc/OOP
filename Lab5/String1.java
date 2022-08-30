public class String1 {
   public static String shortName(String str) {
      String[] ArrStr = str.split(" ");
      String result = ArrStr[0] + " " + ArrStr[ArrStr.length-1];
      return result;
   }
   public static String hashtagName(String str){
      String[] ArrStr = str.split(" ");
      String result = "#" + ArrStr[ArrStr.length-1] + ArrStr[0];
      return result;
   }
   public static String upperCaseAllVowel(String str){
      char[] Str_char = str.toCharArray();
      for(int i=0;i<Str_char.length;i++){
         if(Str_char[i] == 'e' || Str_char[i] == 'u' || Str_char[i] == 'i' || Str_char[i] == 'o' || Str_char[i] == 'a' || Str_char[i] == 'y'){
            Str_char[i] = Character.toUpperCase(Str_char[i]);
         }
      }
      return String.valueOf(Str_char);
   }
   public static String upperCaseAllN(String str){
      char[] Str_char = str.toCharArray();
      for(int i=0;i<Str_char.length;i++){
         if(Str_char[i] == 'n'){
            Str_char[i] = Character.toUpperCase(Str_char[i]);
         }
      }
      return String.valueOf(Str_char);
   }
   public static void main(String[] args) {
      String str = "Nguyen Le Trong Tin";
      System.out.println(shortName(str));
      System.out.println(hashtagName(str));
      System.out.println(upperCaseAllVowel(str));
      System.out.println(upperCaseAllN(str));
   }
}
