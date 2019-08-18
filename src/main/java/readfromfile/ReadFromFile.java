package readfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
  public static void main(String[] args) throws FileNotFoundException {
    String separator=File.separator;
    String path = separator + "Users"+ separator +"alexandrkanishevskii"+separator+"Desktop"+separator+"test.txt";
    File file =new File(path);

    Scanner scanner=new Scanner(file);
    while (scanner.hasNextLine()){
      System.out.println(scanner.nextLine());
    }
  }
}
