public class Main {
   public static void main(String[] args) {
      // MoveablePoint point = new MoveablePoint(1,2,4,1);
      MovablePoint Cir = new MovablePoint(1, 1, 3, 3);
      // point.moveDown();
      Cir.moveRight();
      System.out.println(Cir.toString());
   }
}
