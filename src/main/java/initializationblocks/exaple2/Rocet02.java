package initializationblocks.exaple2;

class Rocet1{
  Rocet1(){
    System.out.println("stage 2.1");
  }
  {
    System.out.println("stage 2");
  }
}

public class Rocet02 extends Rocet1 {
static {
  System.out.println("stage 1");
}
  {
    System.out.println("stage 3");
  }

  {
    System.out.println("stage 3.1");
  }


    Rocet02(){
  super();
    System.out.println("stage 4 ");
  }


  public static void main(String[] args) {
    new Rocet02();
  }
}