package upcastingdowncasting;

public class Test {
  public static void main(String[] args) {

    //Upcasting - восходяще преобразование
    Dog dog=new Dog();
    Animal animal= dog;


    //Downcasting -ниcходяще преобразование

    Dog dog1= (Dog) animal;

  }
}
