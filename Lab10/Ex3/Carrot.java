// package Ex3;

public class Carrot implements Vegetable {
   private String type;

   public Carrot(){
      this.type = "TRung Quoc";
   }
   public Carrot(String type){
      this.type = type;
   }
   @Override
   public String getinfo() {
      return "Carrot[" + this.type + "]";
   }
}
