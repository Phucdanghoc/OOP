public class Manager extends Employee {
   private String position;
   private String department;
   private double salaryCoefficientPosition;
   public Manager(){
      super.ID = "0";
      super.fullName = "";
      super.yearJoined = 2020;
      super.coeffcientsSalary = 1;
      super.numDaysOff = 0;
      this.position = "Head of Administration";
      this.department = "";
      this.salaryCoefficientPosition = 0;
   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
   public String getPosition() {
      return position;
   }
   public void setPosition(String position) {
      this.position = position;
   }
   public Manager(String ID,String fullName, double coeffcientsSalary,String position,double salaryCoefficientPosition ){
      super(ID, fullName, coeffcientsSalary);
      this.setPosition(position);
      this.salaryCoefficientPosition =salaryCoefficientPosition;
      super.yearJoined = 2020;
      super.numDaysOff = 0;
   }
   public String considerEmulation(){
      return "Grade A"; 
   }
   public double bonusByPosition(){
      return this.salaryCoefficientPosition*super.getSalary();
   }
   public double getSalary(){
      return super.getSalary() + super.getSalary()*(super.coeffcientsSalary + 1) + this.coeffcientsSalary + bonusByPosition();
   }
}
