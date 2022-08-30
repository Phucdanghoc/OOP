package ClassWork2;

import java.util.ArrayList;

public class Main {
   public static boolean CheckPoint(Point pont){
      double distance = Math.sqrt(Math.pow(pont.x, 2) + Math.pow(pont.y, 2));
      if(distance > 1){
         return false;
      }
      return true;
   }
   public static void main(String[] args) {
      ArrayList<Point> arraypoint = new ArrayList<Point>();
      Point point1 = new Point(1.2,2);
      Point point2 = new Point(0.2,1);
      Point point3 = new Point(0.5, 0.1);
      arraypoint.add(point1);
      arraypoint.add(point2);
      arraypoint.add(point3);
      System.out.println(arraypoint.get(0));
      for(Point i: arraypoint){
         if(CheckPoint(i)){
            System.out.println("Ponit" + i + " is in circle ");
            continue;
         }
         System.out.println("Ponit " + i + " isn't in circle ");
      }
      
   }
}
