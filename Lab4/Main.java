public class Main {
   public static void main(String[] args) {
      // // Point2D class
      // Point2D point1 = new Point2D();
      // System.out.println(point1.getX());
      // Point2D point2 = new Point2D(0.12f,8.8f);
      // System.out.println(point2.getX());
      // System.out.println(point2.getY());
      
      // // Student 
      // Student st = new Student(12,"LE","PHUC");
      // System.out.println("Firstname is "+st.getFirstName());
      // System.out.println("Lastname is " + st.getLastName());
      // System.out.println("ID is " + st.getID());
      // System.out.println(st.toString());

      // Rectangle
      // Rectangle wigth = new Rectangle(5,6);
      // System.out.println(wigth.getWidth());
      // System.out.println(wigth.getArea());

      // // House
      // House home = new House("411",4,true,500.5,4000);
      // System.out.println(home.toString());
      // House home1 = new House();
      // System.out.println(home1);
      // home.setNumberofBedroom(6);
      // System.out.println(home.toString());

      // Fraction 
      Fraction fra = new Fraction(1,6); //a
      Fraction newFara = new Fraction(3,4);
      System.out.println(newFara.add(fra).toString());
      System.out.println(newFara.mul(fra).toString());
   }
}
