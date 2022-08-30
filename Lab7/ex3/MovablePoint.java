public class MovablePoint implements Movable {
   int x,y,xSpeed,ySpeed;

   public MovablePoint(int x2, int y2, int xSpeed2, int ySpeed2) {
   }
   public void MoveablePoint(int x,int y,int xSpeed,int ySpeed){
      this.x = x;
      this.y = y;
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
   }
   public String toString() {
      return "y:"  + this.y  + ",x:" + this.x;
   }
   @Override
   public void moveUp() {
      y = y + ySpeed;
   }

   @Override
   public void moveDown() {
      y = y - ySpeed;      
   }

   @Override
   public void moveLeft() {
      x = x - xSpeed;
   }

   @Override
   public void moveRight() {
      x = x + xSpeed;      
   }
}
