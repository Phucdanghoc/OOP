package ClassWork3;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Main {
   public static <E> boolean writeFile(String path, ArrayList<E> lst){
      try{
         FileWriter myWrite = new FileWriter(path+".txt");
         for(E i: lst){
            myWrite.write(i.toString());
            myWrite.write("\n");
         }
         myWrite.close();
         return true;
      }
      catch(IOException e){
         return false;
      }
   }
   public static ArrayList<Student> findStudents(ArrayList<Student> lstStu){
      ArrayList<Student> NameRankA = new ArrayList<>();
      for( Student i : lstStu){
         if(i.getRank().equals("A") || i.getRank().equals("Pass")){
            NameRankA.add(i);
         }
      }
      return NameRankA;
   }
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Student> lStudents = new ArrayList<Student>();
      Student stu1 = new MathStudent("Van A",8,"H12");
      Student stu2 = new MathStudent( "Thi B",4.5, "H33");
      Student stu3 = new ITStudent("Van C", 7.7, 123);
      Student stu4 = new ITStudent( "THi D",9.7,125);
      lStudents.add(stu1);
      lStudents.add(stu2);
      lStudents.add(stu3);
      lStudents.add(stu4);
      
      if(writeFile("ListStudent",lStudents)){
         System.out.println("File import successful");
      }
      else{
         System.out.println("File import failed");
      }
   }
}
