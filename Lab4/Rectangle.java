public class Rectangle {
   private float width = 1.0f;
   private float lenght = 1.0f;
   public Rectangle(){

   }
   public Rectangle(float wight, float lenght){
      this.lenght = lenght;
      this.width = wight;
   }
   public float getWidth(){
      return width;
   }
   public float getLenght(){
      return lenght;
   }
   public float getArea(){
      return width*lenght;
   }
   public float getPerimeter(){
      return (width+lenght)*2;
   }
   public void getWight(float width){
      this.width = width;
   } 
   public void getLenght(float lenght){
      this.lenght = lenght;
   }
   public String toString(){
      return "Rectangle[" + width + "," + lenght + "]"; 
   }
}
