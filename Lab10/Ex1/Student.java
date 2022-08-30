// package Ex1;
class Student{
    double score;
    String name;
    String address;
     String sex;
   public Student(){
      name = " ";
      this.address= " ";
      this.score = 0;
      this.sex = " ";
  }
  public  Student(String name, String address, String sex, double score){
      this.name = name;
      this.address = address;
      this.sex = sex;
      this.score = score;
  }
   class StudentOperator{
      public  void print(){
         System.out.println("Student [" + name  + ","  + address + ","  + sex  + ","  + score  + "]");
      }
      public  String type(){
         if(score > 8){
            return "A";
         }
         else if(5 <= score && score <= 8){
            return "B";
         }
         return "C";
      }
   }
   public static void main(String[] args) {
      
      Student stu1 = new Student("Phuc","Ho Chi Minh","Male",8.9);
      Student.StudentOperator Student = stu1.new StudentOperator();
      Student.print();
      System.out.println(Student.type());
   }
}