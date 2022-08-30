package ClassWork1;
public class Student extends Person {
   protected String Id ;
   protected int Score;

   public Student(int birthYear,String Name,int Score,String Id){
      super(birthYear, Name);
      this.Id = Id;
      this.Score = Score;
   }
   public void setScore(int score) {
      Score = score;
   }
   public int getScore() {
      return Score;
   }
   public void setId(String id) {
      Id = id;
   }
   public String getId() {
      return Id;
   }
   @Override
   public String toString() {
      return super.toString() + "|| ID: " + this.Id + "|| Score: " + this.Score;
   }
}
