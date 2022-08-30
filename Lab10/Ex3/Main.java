// package Ex3;

public class Main {

   public static void main(String[] args) {
     VegetableFactory vgtFactory = new VegetableFactory();
     Vegetable cr = vgtFactory.getVegetable("Carrot");
     System.out.println(cr.getinfo());
     Vegetable cb = vgtFactory.getVegetable("Cabbage");
     System.out.println(cb.getinfo());
     Vegetable pk = vgtFactory.getVegetable("Pumpkin");
     System.out.println(pk.getinfo());
   }
 }