package ClassWork3;

public abstract class Student {
   protected String sName;
   protected double gpa;
   public Student(String sName,double gpa){
      this.gpa = gpa;
      this.sName = sName;
   }
   public abstract String getRank();

}
