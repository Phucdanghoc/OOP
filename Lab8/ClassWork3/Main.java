package ClassWork3;

import java.util.ArrayList;

public class Main {
   public static ArrayList<Student> findStudents(ArrayList<Student> lstStu){
      ArrayList<Student> NameRankA = new ArrayList<>();
      for( Student i : lstStu){
         if(i.getRank().equals("A") || i.getRank().equals("Pass")){
            NameRankA.add(i);
         }
      }
      return NameRankA;
   }
   public static void main(String[] args) {
      ArrayList<Student> lStudents = new ArrayList<>();
      Student stu1 = new MathStudent("Van A",8,"H12");
      Student stu2 = new MathStudent( "Thi B",4.5, "H33");
      Student stu3 = new ITStudent("Van C", 7.7, 123);
      Student stu4 = new ITStudent( "THi D",9.7,125);
      lStudents.add(stu1);
      lStudents.add(stu2);
      lStudents.add(stu3);
      lStudents.add(stu4);
      System.out.println("Student in Rank A and Pass are : ");
      for(Student i: findStudents(lStudents)){
         System.out.println(i);
      }
   }
}
