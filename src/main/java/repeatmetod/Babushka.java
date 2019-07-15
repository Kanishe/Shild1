package repeatmetod;

public class Babushka {


  public static void main(String[] args) {


    BabushkaSum ba = new BabushkaSum();

    ba.sumage(83, 99);
    int agesold=ba.sumage(88,99);
    System.out.println(agesold);
    System.out.println(ba.sumage(98823,99));

  }
}
