public class SeasonalStaff extends Staff{
   private int hourlyWage;

   public SeasonalStaff(String sID,String sName,int hourlyWage){
      super(sID, sName);
      this.hourlyWage = hourlyWage;
   }
   public int getHourlyWage() {
      return hourlyWage;
   }
   public void setHourlyWage(int hourlyWage) {
      this.hourlyWage = hourlyWage;
   }
   public double paySalary(int workedHour){
      return this.hourlyWage*workedHour;
   }
   @Override
   public String toString() {
      return this.sID + "_" + this.sName + "_" + this.hourlyWage;
   }
}
