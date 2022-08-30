public class House{
   private String houseCode = "A01";
   private int numOfBedRooms = 2;
   private boolean hasSwimmingPool = false ;
   private double area = 0 ;
   private double costPerSquareMeter = 0;
   public House() {

   }
   public House(String houseCode,int numOfBedRooms,boolean hasSwimmingPool,double area,double costPerSquareMeter){
      this.houseCode = houseCode;
      this.numOfBedRooms = numOfBedRooms;
      this.hasSwimmingPool = hasSwimmingPool;
      this.area = area;
      this.costPerSquareMeter = costPerSquareMeter;
   }
   public int getNumberofBedroom(){
      return numOfBedRooms;
   }
   public String getHouseCode(){
      return houseCode;
   }
   public boolean getHasSwimmingPool(){
      return hasSwimmingPool;
   } 
   public double getArea(){
      return area;
   }
   public double costPerSquareMeter(){
      return costPerSquareMeter;
   }
   public void setNumberofBedroom(int numOfBedRooms) {
      this.numOfBedRooms = numOfBedRooms;
   }
   public void setHouseCode(String houseCode){
      this.houseCode = houseCode;
   }
   public void setHasSwingmingPool(boolean hasSwimmingPool) {
      this.hasSwimmingPool = hasSwimmingPool;
   }
   public void setArea(Double area) {
      this.area = area;
   }
   public void setCostPerSquareMeter(Double costPerSquareMeter){
      this.costPerSquareMeter = costPerSquareMeter;
   }
   public Double calculateSellingPrice(){
      double SubTotal = area * costPerSquareMeter;
      if(hasSwimmingPool == true){
         return SubTotal*1.5;
      }
      else{
         return SubTotal*1.1;
      }
   }
   public String toString(){
      if(hasSwimmingPool == true){
         return "House[" + houseCode + "," + numOfBedRooms + "," + "has pool"  + "," + calculateSellingPrice() + "]";
      }
      else{
         return "House[" + houseCode + "," + numOfBedRooms + "," + "no pool"  + "," + calculateSellingPrice() + "]";
      }
   }
}
