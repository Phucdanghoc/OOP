public class Circle extends Shape {
   private double radius;
   public Circle(){
      this.radius = 1;
   }
   public Circle(double radius,String color, boolean filled){
      super(color, filled);
      this.radius = radius;
   }
   public double getRadius() {
      return radius;
   }
   @Override 
   public double getArea() {
      return radius*radius*3.14;
   }
   @Override 
   public double getPerimeter(){
      return radius*2*3.14;
   }
   @Override
   public String toString() {
      return "Circle[" + this.radius + ","  + super.getColor() + "," + super.isFilled() + "]" ;
   }
   @Override
   public boolean equals(Shape s) {
      if(s.getArea() == getArea()){
         return true;
      }
      return false;
   }
}
