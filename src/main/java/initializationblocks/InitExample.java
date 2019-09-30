package initializationblocks;

class Parent{
  static {
    System.out.println("1static parent block");
  }

  Parent(){
    super();
    System.out.println("2parent constructor");
  }

}


public class InitExample  extends Parent{
  static {
    System.out.println("3static init block");
  }

  {
    System.out.println("4init block1");

  }

  {
    System.out.println("5init block2");
  }

  InitExample(){
    super();
    System.out.println("6constructor");
  }

  public static void main(String[] args) {
    new InitExample ();
  }
  {
    System.out.println("7inut block3");
  }
  static {
    System.out.println("8static init block2");
  }
}
