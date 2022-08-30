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
   public double getArea() {
      return radius*radius*3.14;
   }
   public double getPerimeter(){
      return radius*2*3.14;
   }
   @Override
   public String toString() {
      return "[" + this.radius + ","  + super.getColor() + "," + super.isFilled() + "]" ;
   }
}
