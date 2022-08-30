public class Rectangle extends Shape {
   private double length;
   private double width;

   public Rectangle(){
      this.length = 1;
      this.width = 1;
   }
   public Rectangle(double length, double width, String color) {
      super(color);
      this.length = length;
      this.width = width;
      }
   @Override
   public double getArea() {
      return this. length * this.width;
   }
   public double getPerimeter() {
      return (this.length + this.width) * 2.0;
   }
   @Override
   public boolean equals(Object obj){
      if(obj instanceof Rectangle){
         Rectangle tem = (Rectangle) obj;
         if(this.getArea() == tem.getArea()){
            return true;
         }
      }
      return false;
   }
   public String toString() {
      return "Rectangle{" + "length=" + length + ", width=" + width + ", color=" + color + '}';
   }
}
