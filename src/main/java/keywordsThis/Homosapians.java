package keywordsThis;

public class Homosapians {
  public static void main(String[] args) {
    Person person1=new Person("Tim",20);
    System.out.println(person1.getName() +"\n "+ person1.getAge());
  }
}


class Person{
  private String name;
  private int age;

  Person (String name, int age){
    this.name=name;
    this.age=age;
  }


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
}