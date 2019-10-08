package exeption.example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Exeptions1 {
  public static void main(String[] args)  throws FileNotFoundException {
    File file=new File("");
    Scanner scanner=new Scanner(file);
  }
}
