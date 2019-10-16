package javarash.level2.level2lesson7;

public class MethodCall2 {
  public static void main(String[] args) {
    double a=23.24,b=43.24;
    double min=minNumber(a,b);
    System.out.println("Minimum is = " + min);
  }

  public static double minNumber (double c, double g) {
    double min2;
    if (c<g)
      min2=c;
    else
      min2=g;
  return min2;
  }
}
