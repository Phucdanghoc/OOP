public class Rectangle extends Shape {
   protected double width;
   protected double lenght;

   public Rectangle(){
      this.lenght = 1;
      this.width = 1;
   }
   public Rectangle(double width, double lenght){
      this.width = width;
      this.lenght = lenght;
   }
   public Rectangle(double width, double lenght,String color,boolean filled){
      super(color, filled);
      this.width = width;
      this.lenght = lenght;
   }
   public double getWidth() {
      return width;
   }
   public double getLenght() {
      return lenght;
   }
   public void setWidth(double width) {
      this.width = width;
   }
   public void setLenght(double lenght) {
      this.lenght = lenght;
   }
   public double getArea() {
      return (this.lenght+this.width)*2;
   }
   @Override
   public String toString() {
      return "[" + super.getColor() + "," + super.isFilled() + "," + this.width + "," + this.lenght + "]";
   }
}
