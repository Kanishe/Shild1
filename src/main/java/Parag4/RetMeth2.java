package Parag4;

class RetMeth2 {
  public static void main(String[] args) {
    Vehicle2 miniven = new Vehicle2();
    Vehicle2 sportcar = new Vehicle2();

    int rangeminiven, rangesportcar;


    miniven.passengers = 7;
    miniven.fuelcap = 16;
    miniven.mpg = 21;


    sportcar.passengers = 2;
    sportcar.fuelcap = 14;
    sportcar.mpg=12;



    rangeminiven=miniven.range();
    rangesportcar=sportcar.range();
    


    System.out.println("Фургон" + miniven.passengers + "проедет" + rangeminiven);
    System.out.println(" Спорткар" + sportcar.passengers + "проедет" + rangesportcar);



  }
}
