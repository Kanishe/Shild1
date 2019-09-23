package Konstructor.konstructor04082019;

public class Homo {
  public static void main(String[] args) {
    Person person1=new Person("1");
    System.out.println(person1.getName()+"\n"+person1.getAge());

  }
}

class Person{

  private int age;
  private String name;

  //constructors
  public Person(){
    this.name= "default name";
    this.age= 0;
    System.out.println("hi, from first constructor!");
  }
  public Person(String name){
    this.name=name;
    System.out.println("hi, from second constructor!!");
  }
  public Person(String name, int age){
    this.name=name;
    this.age=age;
    System.out.println("hi, from third constructor!!");
  }

  // getters and setters
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

public void setName(String name) {
    this.name = name;
}
}
