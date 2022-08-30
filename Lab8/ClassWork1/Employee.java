package ClassWork1;
public class Employee extends Person{
   protected String Id;
   protected double salary;

   public Employee(int birthYear,String Name,String Id,double salary){
      super(birthYear, Name);
      this.Id = Id;
      this.salary = salary;
   }
   public String getId() {
      return Id;
   }
   public void setId(String id) {
      Id = id;
   }
   public void setSalary(double salary) {
      this.salary = salary;
   }
   public double getSalary() {
      return salary;
   }
   @Override
   public String toString() {
      return super.toString() + "||Id: " + this.Id +  "|| Salary: " + this.salary;
   }
}
