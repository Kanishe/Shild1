package repeatStatic;

public class Lesson21 {
  public static void main(String[] args) {
    Human human1=new Human("Tom",26);
    Human human2=new Human("Bob",54);
    human1.howManyGays();
    human2.howManyGays();
    Human human3=new Human("Key", 90);

    human1.howManyGays();
    human2.howManyGays();
    human3.howManyGays();



  }

}



class Human {
  private int age;
  private String name;

  private static int countPeople=0;


  public Human(String name, int age) {
    this.age=age;
    this.name=name;
    countPeople++;

  }


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

  public  void howManyGays(){
    System.out.println("How many people?" + countPeople);
  }

}