package ClassWork3;

public class ITStudent extends Student {
   protected int sID;
   public ITStudent(String sName,double gpa,int sID){
      super(sName, gpa);
      this.sID = sID;
   }
   @Override
   public String getRank() {
      if(super.gpa <= 5){
         return "C";
      }
      else if (super.gpa > 5 && super.gpa < 8){
         return "B";
      }
      else if(super.gpa > 8 && super.gpa <= 10){
         return "A";
      }
      return "gpa wrong";
   }
   @Override
   public String toString() {
      return this.sName + " - " + this.sID + " - " + this.gpa;

   }
}
