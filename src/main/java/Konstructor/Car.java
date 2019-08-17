package Konstructor;

public class Car {
  private String model;
  private int speed;


  private Car(String model, int speed){
    this.model=model;
    this.speed=speed;

  }

  public static void main(String[] args) {
    Car bugatti = new Car("Veyron", 999);
    System.out.println( bugatti.speed + ""+ bugatti.model);

  }

}


