package str155166;

public class CompFuels {
  public static void main(String[] args) {

    Vehicle miniven=new Vehicle();
    Vehicle sportcar=new Vehicle();

    double galones;
    int dist =252;

    miniven.passangers = 7;
    miniven.fuelcap = 16;
    miniven.mpg = 21;


    sportcar.passangers = 2;
    sportcar.fuelcap = 14;
    sportcar.mpg=12;


    galones=miniven.fuelneeded(dist);

    System.out.println("Для преодоления " + dist +
            " миль мини-фургону требуется " +
            galones + " галлонов топлива");


    System.out.println("Для преодоления" + dist +
            " миль спортивному автомобилю требуется +" +
            galones + "галлонов топлива");







  }
}
