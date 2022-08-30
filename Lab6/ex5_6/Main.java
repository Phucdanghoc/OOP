public class Main {
   public static void main(String[] args) {
      Employee emp = new Employee("29","Phuc",56.9);
      // System.out.println(emp.considerEmulation());
      
      Employee mana = new Manager("5","phuc",5,"Sale",4);
      System.out.println(mana.getSenioritySalary());
      System.out.println(mana.considerEmulation());
      System.out.println(mana.getSalary());
   }
}