package interfase.interface2;

public class Person implements Info{
  String name;

  public void showInfo(){
    System.out.println("show info"+ this.name);
  }

  public Person(String name){
    this.name=name;
  }

  public void sayHello(){
    System.out.println("Hello");
  }
}
