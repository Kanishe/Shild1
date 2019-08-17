package Lesson6;

public class MethodOverloding2 {

  int sum (int i1, int i2){
    return i1*i2;
  }

  String sum(String s1, String s2){
    return s1+s2;
  }

  public static class MethodOverloding2tTest{
    public static void main(String[] args) {

      MethodOverloding2 mO2 =new MethodOverloding2();
      int a = mO2.sum(14, 4);
      System.out.println(a);
      String s= mO2.sum("Поторяю ovelodading method:", "  повторение- мать учения");
      System.out.println(s);

    }
  }

}
