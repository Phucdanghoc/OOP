import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class GetFile {
    public static String[] listFile(String linkFile){
        File file = new File(linkFile);
        String[] list = file.list();
        return list;
    }
    public static boolean CheckFile(String file_fold){
        File file = new File(file_fold);
        if(file.exists()){
            return true;
        }
        else{
            return false;
        }
    }
    public static String CheckFileOrFolder(String linkFile){
        File file = new File(linkFile);
        if(file.isFile()){
            return "This is File";
        }
        else{
            return "This is directory";
        }
    }
    public static String AppendText(String linkFile) throws IOException{
        if(CheckFile(linkFile) == false){
            return "File not found";
        }
        System.out.println("Write a text");
        Scanner text = new Scanner(System.in);
        File file = new File(linkFile);
        FileWriter myfile = new FileWriter(file,true);
        BufferedWriter mybuffer = new BufferedWriter(myfile);
        PrintWriter myprint = new PrintWriter(mybuffer);
        String write = text.nextLine();
        myprint.println(write);
        myprint.close();
        myfile.close();
        text.close();
        return "Completed";
    }
    public static String LongWord(String linkFile){
        try {
            int max = 0;
            String word = "";
            File file = new File(linkFile);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNext()) {
                String data = myReader.next();
                int lenWord = data.length();
                if(lenWord > max){
                    max = lenWord;
                    word = data;
                }
            }
            myReader.close();
            return word;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }
    public static void main(String a[]) throws IOException{
        String linkFile = "hi.txt";
        System.out.println(CheckFile(linkFile));
        System.out.println(CheckFileOrFolder(linkFile));
        System.out.println(AppendText(linkFile));
        System.out.println("the longest word in a text file is " + LongWord(linkFile));
    }
}