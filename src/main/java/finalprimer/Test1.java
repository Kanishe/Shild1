package finalprimer;

public class Test1 {

  public final int a;

  Test1(){
    a=10;

  }
  Test1(boolean b){
    a=10;

  }
  public static void main(String[] args) {
    Test1 t=new Test1();
    System.out.println(t.a);
  }
}
