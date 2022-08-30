public class Main {
   public static void main(String[] args) {
      Circle cir = new Circle();
      System.out.println(cir.getArea());
      ResizableCircle res = new ResizableCircle();
      res.resize(50);
      System.out.println(res.getPerimeter());
   }
}
