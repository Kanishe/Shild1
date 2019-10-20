package javarash.level2.lev2les9.catwhisconstructor;

public class Cat {
  String name;
  int age;
  static int count=0;  //!!! если не static не происходит счет
  /**
   * Эта переменная обозначена ключевым словом static. Это значит, что она принадлежит классу, а не конкретному объекту класса.
   * Что, конечно, логично: если имя у каждого кота должно быть свое, то счетчик котов нам нужен один на всех.
   * Именно этого позволяет добиться слово static — переменная count одна для всех котов.*/

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    count++;

  }

  public Cat (){
    count++;
    this.name="Street cat"+ count;
  }

  public static void main(String[] args) {
    Cat cat1 =new Cat("Jim", 3);
    Cat cat2 =new Cat();
    Cat cat3 =new Cat();
    Cat cat4 =new Cat();
    System.out.println(cat1.name);
    System.out.println(cat2.name);
    System.out.println(cat3.name);
    System.out.println(cat4.name);

  }
}
