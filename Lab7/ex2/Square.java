public class Square extends Rectangle{
   public Square(){
      super();
   }
   public Square(double side ){
      super(side,side);
   }
   public Square(double side, String color , boolean filled){
      super(side,side);
      super.color = color;
      super.filled = filled;
   }
   public double getSide(){
      return this.lenght;
   }
   public void setSide(double side) {
      super.setWidth(side);
      super.setLenght(side);
   }
   @Override
   public void setWidth(double width){
      setSide(width);
   }
   @Override
   public void setLenght(double length){
      setSide(length);
   }
   @Override
   public boolean equals(Shape s) {
      if(s.getArea() == super.getArea()){
         return true;
      }
      return false;
   }
   @Override
   public String toString() {
      return "Square[" + this.lenght + ","  + super.getColor() + "," + super.isFilled() + "]" ;
   }

}
