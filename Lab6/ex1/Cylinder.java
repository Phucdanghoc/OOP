public class Cylinder extends Circle {
   private double height;

   public Cylinder(){
      this.height = 1;
   }
   public Cylinder(double radius ){
      super(radius);
   }
   public Cylinder(double radius,double height){
      super(radius);
      this.height = height;
   }
   public Cylinder(double radius, double height,String color){
      super(radius, color);
      this.color = color;
   }
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }
   public double getVolume() {
      double Volume = this.height * super.getArea();
      return Volume;
   }
   @Override
   public String toString() {
      return "Cylinder has height: " + this.height + "and V: " + getVolume();
   }
}
