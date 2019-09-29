package exeption.exaple2;
//todo 354 line Shild

public class Massive {
  public static void main(String[] args) {
    int m [] = new int[5];
    try {
      System.out.println("Before generate exeption");
      m[9]=10;
      System.out.println("this invisible line");
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("exit beyond the limits massive");
    }

    System.out.println("after line catch");
  }
}
