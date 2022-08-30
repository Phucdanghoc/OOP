package ClassWork1;
public class Person {
   protected int birthYear;
   protected String Name;

   public Person(int birthYear,String Name){
      this.birthYear  = birthYear;
      this.Name = Name;
   }
   public void setBirthYear(int birthYear) {
      this.birthYear = birthYear;
   }
   public int getBirthYear() {
      return birthYear;
   }
   public void setName(String name) {
      Name = name;
   }
   public String getName() {
      return Name;
   }
   @Override
   public String toString() {
      return "Name: " + getName() +" || BirthYear: " + getBirthYear();
   }
}
