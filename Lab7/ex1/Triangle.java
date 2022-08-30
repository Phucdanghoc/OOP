public class Triangle extends Shape {
   private double base;
   private double heigth;

   public Triangle(){
      this.base = 1;
      this.heigth = 1;
   }
   public Triangle(double base,double heigth,String color){
      super(color);
      this.base = base;
      this.heigth = heigth;
   }
   @Override
   public double getArea() {
      return 0.5*base*heigth;
   }
   public String toString() {
      return "Triangle{" + "base=" + this.base + ", heigth=" + heigth + ", color=" + color + '}';

   }
}
