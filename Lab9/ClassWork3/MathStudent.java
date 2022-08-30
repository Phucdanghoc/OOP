package ClassWork3;

public class MathStudent extends Student  {
   protected String sID;
   public MathStudent(String sName, double gpa,String sID) {
      super(sName, gpa);
      this.sID = sID;
   }
   @Override
   public String getRank() {
      if(super.gpa >= 5){
         return "Pass";
      }
      return "Failed";
   }
   @Override
   public String toString() {
      return this.sName + " - " + this.sID + " - " + this.gpa;

   }
}
