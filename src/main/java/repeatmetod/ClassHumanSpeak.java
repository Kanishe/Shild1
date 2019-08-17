package repeatmetod;

public class ClassHumanSpeak {
  public  static  void main(String[] args) {
    Person person=new Person();

    person.name="Sasha";
    person.age=25;
    person.speak();
    person.speakInEnglish();
    person.calculateYersToBeaJavaDevelop();
    int yeartostadyjava=person.iNeedTimeForPractice();

    System.out.println(yeartostadyjava);

  }
}

  class Person {
    String name;
    int age;

    void calculateYersToBeaJavaDevelop(){
      int years = age-23;
      System.out.println("When i will be a JavaDevelop - " + years + " years");
    }

    int iNeedTimeForPractice(){
      int yeartostady= 25-2;
      return yeartostady;
    }
    


    void speak() {
      for (int i = 0; i < 3; i++) {
        System.out.println("Повторяю методы  " + name + age);
      }
    }

    void speakInEnglish() {
      System.out.println("Repead");
    }
  }
