import java.io.File; // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;
import java.io.IOException;


public class SumNumInFile {
   public static void main(String[] args) throws IOException {
      try {
         File myObj = new File("input.txt");
         FileWriter myWrite = new FileWriter("output.txt");
         Scanner myReader = new Scanner(myObj);
         int Sum = 0;
         System.out.println("Number in file:");
         while (myReader.hasNext()) {
            String data = myReader.next();
            System.out.println(data);
            Sum += Integer.parseInt(data);
         }
         myWrite.write(String.valueOf(Sum));
         myReader.close();
         myWrite.close();
      } 
      catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
}