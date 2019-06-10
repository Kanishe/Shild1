public class RelLogOps {
  public static void main(String[] args) {
    int i,j;
    boolean b1,b2;

    i=10;
    j=11;

    if (i<j) System.out.println("i<j ");
    if (i<=j) System.out.println("i<=j ");
    if (i != j) System.out.println("i!= j ");
    if (i==j) System.out.println("Этo не будет выполнено");
    if (i>=j) System.out.println("Этo не будет выполнено");
    if (i>j) System.out.println("Этo не будет выполнено");


    b1=true;
    b2=false;

    if (b1&b2) System.out.println("Этo не будет выполнено");
    if (!(b1&b2)) System.out.println("!(Ьl & Ь2): true");
    if (b1|b2) System.out.println("Ьl | Ь2: true");
    if (b1^b2) System.out.println("Ьl ^ Ь2: true");

  }
}
