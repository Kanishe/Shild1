package blockinitianal;

public class HelloWorld {


    static {
      System.out.println("static block");
    }

    {
      System.out.println("block");
    }

    public HelloWorld () {
      System.out.println("Constructor");
    }

    public static void main(String []args){
      HelloWorld obj = new HelloWorld();
    }



}
