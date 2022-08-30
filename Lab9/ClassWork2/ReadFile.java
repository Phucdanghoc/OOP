import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
   public static void main(String[] args) throws IOException {
      File myObj = new File("input.txt");
      FileWriter myWrite = new FileWriter("output.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
         String data = myReader.nextLine();
         String change = data.toUpperCase();
         myWrite.write(change);
      }
      myReader.close();
      myWrite.close();
   }
}

  
