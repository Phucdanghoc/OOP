public class Square extends Rectangle{
   public Square(){
      
   }
   public Square(double side ){
      super(side,side);
   }
   public Square(double side, String color , boolean filled){
      super.setFilled(filled);
      super.setColor(color);
      super.lenght = side;
      super.width = side;
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
   public String toString() {
      return "[" + this.lenght + ","  + super.getColor() + "," + super.isFilled() + "]" ;
   }

}
