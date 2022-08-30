public class Staff extends Person  {
   private String school;
   private double pay;

   public Staff(String name,String school,String address,double pay ){
      super(name, address);
      this.school = school;
      this.pay = pay;
   }
   public String getSchool() {
      return this.school;
   }
   public void setSchool(String school) {
      this.school = school;
   }
   public double getPay() {
      return this.pay;
   }
   public void setPay(double pay) {
      this.pay = pay;
   } 
   @Override
   public String toString() {
      return "[" + super.getName() + "," + this.school + "," + super.getAddress() + "," + this.pay + "]"; 
   }
}
