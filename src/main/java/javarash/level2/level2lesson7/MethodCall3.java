package javarash.level2.level2lesson7;

public class MethodCall3 {
  public static void main(String[] args) {
    boolean a =true,b=false;
    boolean ok= trueMethod(a,b);
    System.out.println("True is a = " + ok);
  }
  public static boolean trueMethod(boolean c, boolean g){
    boolean ok2;
    if (c=true)
    ok2=c;
    else
      ok2=g;
    return ok2;
  }
}
