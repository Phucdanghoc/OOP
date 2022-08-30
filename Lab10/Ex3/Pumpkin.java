// package Ex3;

public class Pumpkin implements Vegetable {
   private double weight;

   public Pumpkin(){
      this.weight = 1;
   }
   public Pumpkin(double weight){
      this.weight = weight;
   }
   @Override
   public String getinfo() {
      // TODO Auto-generated method stub
      return "Pumpkin[" + this.weight + "]";
   }
}
