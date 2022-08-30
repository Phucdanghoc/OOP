// package Ex3;

class VegetableFactory {
   public Vegetable getVegetable(String vegetable){
      if(vegetable.equals(null)){
         return null;
      }
      else if(vegetable.equalsIgnoreCase("Cabbage")){
         return new Cabbage();
      }
      else if(vegetable.equalsIgnoreCase("Carrot")){
         return new Carrot();
      }
      else if(vegetable.equalsIgnoreCase("Pumpkin")){
         return new Pumpkin();
      }
      return null;
   }
    
}