package javarash.level2.lev2les9;
//todo https://javarush.ru/groups/posts/1949-znakomstvo-s-klassami-napisanie-sobstvennihkh-klassov-konstruktorih
public class Cat {
  String name;
  int age;
  static int count=0;

  public void sayMeow(){
    System.out.println("Meow");
  }

  public void jump(){
    System.out.println("Jump");
  }


  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.age=3;
    cat1.name="Tom";
    count++;


    Cat cat2= new Cat();
    cat2.age=5;
    cat2.name="Mos";
    count++;



    System.out.println("Create cat his name is " + cat1.name + ", and his age is " + cat1.age);
    cat1.jump();
    cat1.sayMeow();
    System.out.println("Create cat his name is " + cat2.name + ", and his age is " + cat2.age);
    cat2.jump();
    cat2.sayMeow();
    System.out.println("We have a " + count + " cats");


  }
}
