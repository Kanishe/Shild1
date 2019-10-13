package object;

public class Main {
  public static void main(String[] args) {
    Banya a =new Banya();
    Banya b = a;

    System.out.print(a.equals(b));

  }

  public static class Banya{

  }
}
