package writetofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
  public static void main(String[] args) throws FileNotFoundException {
    File file=new File("test");
    PrintWriter printWriter =new PrintWriter(file);
    System.out.println(System.in);
    printWriter.println("woooo");
    printWriter.close();



  }
}
