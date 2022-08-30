public class Circle {
   protected double radius;
   protected String color;

   public Circle(){
      this.radius = 1;
      this.color = "red";
   }
   public Circle(double radius){
      this.radius = radius;
   }
   public Circle(double radius,  String color){
      this.color = color;
      this.radius = radius;
   }
   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public double getArea() {
      double Area = radius*radius*3.14;
      return Area;
   }
   public String toString() {
      return "Circle has radius :" + this.radius + "color: "+ this.color +  "and Area: " + getArea() ;   
   }
}