public class Main {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[5];
      shapes[0] = new Circle(4, "Red", true);
      shapes[1] = new Rectangle(8, 4, "Blue", true);
      shapes[2] = new Square(10, "Black", true);
      shapes[3] = new Circle(9,"Yellow",true);
      shapes[4] = new Rectangle(12, 8, "Blue", true);
      double maxArea = 0;
      int pos = 0;
      for(int i = 0;i<5;i++){
         if(shapes[i].getArea() > maxArea){
            pos = i;
            maxArea = shapes[i].getArea();
         }
      }
      System.out.println("The Largest Area is " + shapes[pos].toString());
   }
}
