public class Employee {
   protected String ID;
   protected String fullName;
   protected int yearJoined;
   protected double  coeffcientsSalary;
   protected int numDaysOff;

   public Employee(){
      this.ID = "0";
      this.fullName = "";
      this.yearJoined = 2020;
      this.coeffcientsSalary = 1;
      this.numDaysOff = 0;
   }
   public Employee(String ID,String fullName,Double coeffcientsSalary){
      this.ID = ID;
      this.fullName = fullName;
      this.coeffcientsSalary = coeffcientsSalary;
      this.yearJoined = 2020;
      this.numDaysOff = 0; 
   }
   public double getSenioritySalary() {
      if(this.yearJoined > 5){
         return  this.yearJoined * this.coeffcientsSalary/ 100 ;
      }
      return 0;
   }
   public String considerEmulation(){
      if(this.numDaysOff <= 1){
         return "Graded A";
      }
      else if(this.numDaysOff > 3){
         return "Graded C";
      }
      else{
         return "Graded B";
      }
   }
   public double getSalary(){
      double EmulationCoefficient;
      if(this.numDaysOff <= 1){
         EmulationCoefficient = 1;
      }
      else if(this.numDaysOff > 3){
         EmulationCoefficient = 0.75;
      }
      else{
         EmulationCoefficient = 0.5;
      }
      return 1150 + 1150*(this.coeffcientsSalary + EmulationCoefficient) + getSenioritySalary();
   }
}
