// package Ex3;

public class Cabbage implements Vegetable {
   private String type;
   private double weight;
   public Cabbage(){
      this.type = "Trung Quoc";
      this.weight = 1;
   }
   public Cabbage(String type,double weight) {
      this.type = type;
      this.weight = weight;
   }
   @Override
   public String getinfo() {
      // TODO Auto-generated method stub
      return  "Cabbage[" + this.type + ", " + this.weight + "]";
   }
}
