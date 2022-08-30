package ClassWork2;

public class Point {
   public double x;
   public double y;

   public Point(){

   }
   public Point(double x,double y){
      this.x = x;
      this.y = y;
   }
   public void setX(double x) {
      this.x = x;
   }
   public double getX() {
      return x;
   }
   public void setY(double y) {
      this.y = y;
   }
   public double getY() {
      return y;
   }
   @Override
   public String toString() {
      return "(" + this.x + ";" + this.y + ")";
   }
}
