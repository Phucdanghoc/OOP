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
   @Override
   public double getArea() {
      return this.lenght*this.width;
   }
   @Override
   public double getPerimeter(){
      return (this.lenght+this.width)*2;
   }
   @Override
   public boolean equals(Shape s) {
      if(s.getArea() == getArea()){
         return true;
      }
      return false;
   }
   @Override
   public String toString() {
      return "Retangle[" + super.getColor() + "," + super.isFilled() + "," + this.width + "," + this.lenght + "]";
   }
}
