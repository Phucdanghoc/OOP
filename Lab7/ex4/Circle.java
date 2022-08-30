public class Circle implements GeometricObject{
   protected double radius;

   public Circle(){
      this.radius = 1;
   }
   @Override
   public double getArea(){
      return radius*radius*3.14;
   }
   @Override
   public double getPerimeter(){
      return 3.14*radius*2;
   }
}
