public class Main {
  public static void main(String[] args) {
    Club cl = new Club();
    Club le = new Club("phuc",3,4,5);
    System.out.println(le.getName());

    RegularPolygon reg = new RegularPolygon("tamgiac",4,3);
    System.out.println(reg);
    System.out.println(reg.toString());
    System.out.println(reg.getArea());
  }
}