package Parag4;

class RetMeth2 {
  public static void main(String[] args) {
    Vehicle2 miniven = new Vehicle2();
    Vehicle2 sportcar = new Vehicle2();

    int range1, range2;

    //Присваивание значений полям объекта sportcar object.member
    miniven.passengers = 7;
    miniven.fuelcap = 16;
    miniven.mpg = 21;

    //Присваивание значений полям объекта sportcar object.member
    sportcar.fuelcap=14;
    sportcar.passengers=2;
    sportcar.mpg=12;


    range1=miniven.range();
    range2=sportcar.range();

    System.out.println("Mини-фypгoн"+ miniven.passengers + " на расстояние "+ range1 + " миль.");
    System.out.println("Спорткар"+ sportcar.passengers + " на расстояние " +range2 + " миль.");


  }
}
