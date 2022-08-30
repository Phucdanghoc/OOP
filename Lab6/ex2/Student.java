public class Student extends Person {
   private String program;
   private int year;
   private double fee;

   public Student(String name,String address,String program,int year,double fee){
      super(name, address);
      this.program = program;
      this.fee = fee;
      this.year = year; 
   }
   public String getProgram() {
      return this.program;
   }
   public void setProgram(String program) {
      this.program = program;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public int getYear() {
      return this.year;
   }
   public double getFee() {
      return this.fee;
   }
   public void setFee(double fee) {
      this.fee = fee;
   }
   @Override
   public String toString() {
      return "Name:" + super.getName() + " /Adress:" + super.getAddress() + " /Program:" + this.program + " /Year:" + this.year + " /Fee:" + this.fee ; 
   }
}
