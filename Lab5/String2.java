public class String2 {
   public static int countWord(String paragraph){
      paragraph = paragraph.replaceAll(",", "");
      String[] newStr = paragraph.split(" ");
      return newStr.length;
   }
   public static int countSentences(String paragraph) {
      String[] newStr = paragraph.split("\\.");
      return newStr.length;
   }
   public static int  countAppear(String paragraph, String word) {
      String[] newStr = paragraph.split(" ");
      int count = 0;
      for(int i = 0;i<newStr.length;i++){
         if(newStr[i].equals(word) == true){
            count++;
         }
      }
      return count;
   }
   public static void main(String[] args) {
      String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
      System.out.println(countWord(paragraph));
      System.out.println(countSentences(paragraph));
      System.out.println(countAppear(paragraph,"and"));
   }
}
