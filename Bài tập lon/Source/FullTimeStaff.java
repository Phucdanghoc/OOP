public class FullTimeStaff extends Staff {
   private int baseSalary;
   private double bonusRate;

   public FullTimeStaff(String sID,String sName,int baseSalary,double bonusRate){
      super(sID, sName);
      this.baseSalary = baseSalary;
      this.bonusRate = bonusRate;
   }
   public int getBaseSalary() {
      return baseSalary;
   }
   public double getBonusRate() {
      return bonusRate;
   }
   public void setBonusRate(double bonusRate) {
      this.bonusRate = bonusRate;
   }
   public void setBaseSalary(int baseSalary) {
      this.baseSalary = baseSalary;
   }
   public double paySalary(int workedDays){
      if (workedDays <= 21) {
         return this.baseSalary*this.bonusRate;
      }
      return this.baseSalary*this.bonusRate +  (workedDays - 21)*100000;
   }
   @Override
   public String toString() {
      return this.sID + "_" + this.sName + "_" + this.bonusRate + "_" + this.baseSalary;
   }
}
