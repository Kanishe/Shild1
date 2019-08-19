package innerclasses;

public class ElectroCar {
  private int id;

//не статический вложенный класс относятся к объекту, когда объект класса можно разделить
// на несколько подобъектов
  private class Motor{
    public void startMotor(){
      System.out.println("Motor" +id+" is starting");
    }
  }
  //cтатический вложенный класс
  public static class Battery{
    public void charge(){
      System.out.println("Batteruy is charging");
    }
  }

  public ElectroCar(int id){
    this.id=id;
  }
  public void start(){
    Motor motor=new Motor();
    motor.startMotor();
    final int x=1;
    //вложенный класс имеет доступ и к не статическим полямполям
    //класса Електокар и к методам и переменным но только final
    class SomeClass{
      public void someMethod() {
        System.out.println(x);
        System.out.println(id);
      }

    }
    SomeClass someObject =new SomeClass();
    test(someObject);
    System.out.println("ElectroCar"+id+ "is starting");


  }
  private void test(Object object){

  }

}
