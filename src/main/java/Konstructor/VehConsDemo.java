package Konstructor;

public class VehConsDemo {
  public static void main(String[] args) {
// Завершение создания объектов транспортных средств
    Vehicle miniven = new Vehicle(7,16,21);
    Vehicle sportcar= new Vehicle(2,14,12);
    double gallones;
    int dist=252;

    gallones=miniven.fuelneed(dist);
    System.out.println("Для преодаления" +dist+ "фургону нужно" + gallones);

    gallones=sportcar.fuelneed(dist);
    System.out.println("Для преодаления" +dist+ "спорткару нужно" + gallones);
  }
}
