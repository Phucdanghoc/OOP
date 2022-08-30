public class Point3D extends Point2D{
   private float z;

   public Point3D(){
      this.z = 0.0f;
   }
   public Point3D(float x,float y){
      super(x, y);
   }
   public float getZ() {
      return this.z;
   }
   public void setZ(float z) {
      this.z = z;
   }
   float XYZ;
   public void setXYZ(float x,float y,float z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }
   @Override
   public String toString() {
      return "(" + super.getX() + "," + super.getY() + "," + this.z +  ")";
   }
}
