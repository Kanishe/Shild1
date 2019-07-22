package Lesson6;

public class OverLoding {

  void showTime(int i){
    System.out.println(i);

  }
  void showBoolean(boolean b1){
    System.out.println(b1);
  }

  void showString(String s1){
    System.out.println(s1);
  }

  public static class OverLodingTest{
    public static void main(String[] args) {
      OverLoding mO = new OverLoding();
      int a = 500;
      mO.showTime(a);

      boolean b1 =true;
      mO.showBoolean(b1);

      String s1 = "aganmethod";
      mO.showString(s1);

    }

  }

}
