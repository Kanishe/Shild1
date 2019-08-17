
//https://www.youtube.com/watch?v=uCgF5-yCbGA&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=27

package interfase.interface2;

public class Test {
  public static void main(String[] args) {
    Animal animal1 =new Animal(1);
    Person person1=new Person("Jon");
    person1.sayHello();
    animal1.sleep();

    person1.showInfo();
    animal1.showInfo();



  }
}
