package repeatmetod;

public class ClassHumanSpeak {
  public  static  void main(String[] args) {
    Person person=new Person();

    person.name="Sasha";
    person.age=25;
    person.speak();
    person.speakInEnglish();

  }
}

  class Person {
    String name;
    int age;


    void speak() {
      for (int i = 0; i < 3; i++) {
        System.out.println("Повторяю методы  " + name + age);
      }
    }

    void speakInEnglish() {
      System.out.println("Repead");
    }
  }
