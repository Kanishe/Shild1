package recursion;

public class Example1 {
  public static void main(String[] args) {
    counter(3);

  }
  private  static void counter(int n){
    if (n==0)
      return;
    System.out.println(n);
    counter(n-1);
  }
}
