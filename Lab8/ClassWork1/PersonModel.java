package ClassWork1;
import java.util.ArrayList;
public class PersonModel <T> {
   private ArrayList<T> al = new ArrayList<T>();
   public void add(T obj) {
      al.add(obj);
   }
   public void display() {
      for (T obj : al) {
         System.out.println(obj);
   }
 }
   public static void main(String[] args) {
      PersonModel studnetModel = new PersonModel<>();
      Student std1 = new Student(2003, "Dung", 19, "01");
      Student std2 = new Student(2003, "Phuc", 11,"02");
      studnetModel.add(std1);
      studnetModel.add(std2);
      PersonModel employee = new PersonModel<>();
      Employee emp1 = new Employee(1999,"Truc","02",2.4);
      Employee emp2 = new Employee(1998, "Duc","04",0);
      employee.add(emp1);
      employee.add(emp2);
      PersonModel person = new PersonModel<>();
      Person per1 = new Person(2003,"Linh");
      Person per2 = new Person(2003, "An");
      person.add(per1);
      person.add(per2);
      person.display();
      employee.display();

      studnetModel.display();

 }
}
