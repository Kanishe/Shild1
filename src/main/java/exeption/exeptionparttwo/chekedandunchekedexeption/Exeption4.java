package exeption.exeptionparttwo.chekedandunchekedexeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeption4 {
  public static void main(String[] args) {
    //Checked Exception (Compile time exep.)

    File file=new File("test1");
    try {
      Scanner scanner=new Scanner(file);
    }catch (FileNotFoundException e){
      e.printStackTrace();
    }
  }
}
