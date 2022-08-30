public class Student {
   private int id;
   private String firstName;
   private String lastName;
   public Student(int id,String firstName, String lastName) {
      this.id  = id;
      this.firstName = firstName;
      this.lastName = lastName;
   }
   public int getID(){
      return this.id;
   }
   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return  lastName;
   }
   public void setID(int id) {
      this.id = id;
   }
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public void setLastName(String lastString){
      this.lastName = lastString;
   }
   public String getName() {
      return lastName + firstName;
   }
   public String toString(){
      return "Student[id = " + id + ", firstName = " + firstName + ", lastName = " + lastName +"]";
   }
}