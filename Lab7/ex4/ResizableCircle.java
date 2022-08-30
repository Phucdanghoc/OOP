public class ResizableCircle extends Circle implements Resizable{
   public ResizableCircle(){
      super();
   }
   @Override
   public void resize(int percent) {
      super.radius = super.radius*percent/100 + super.radius;
   }
}
