package HomeWork2;

import java.util.HashMap;
import java.util.Set;

public class English_VietNam {
   public static boolean CheckWord(HashMap<String,String> word_mean,String WordChek){
      Set<String> word = word_mean.keySet();
      for(String i: word){
         if(i.equals(WordChek)){
            return true;
         }
      }
      return false;
   }
   public static String Meaning(HashMap<String,String> word_mean,String WordChek) {
      if(CheckWord(word_mean, WordChek)){
         return word_mean.get(WordChek);
      }
      return "has no word";
   }
   public static void main(String[] args) {
      HashMap<String,String> word_mean = new HashMap<String,String>();
      word_mean.put("dog","cho");
      word_mean.put("chicken","ga");
      word_mean.put("lion","su tu");
      word_mean.put("monkey","khi");
      word_mean.put("cat","meo");
      word_mean.put("fish","ca");
      word_mean.put("pig","heo");
      word_mean.put("bird","chim");
      word_mean.put("snake","ran");
      System.out.println(Meaning(word_mean,"cat"));
      System.out.println(CheckWord(word_mean,"print"));
   }
}
