package method.ex3parametrimetoda;

public class Live {
  public static void main(String[] args) {
    Human human=new Human();
    Human human2=new Human();
    human.setName("Sara");
    human.weight=13;
    human.age=26;

    human2.weight=123;
    human2.age=36;
    human2.name="Bob";

    human.speakEnglish();
    human2.speakEnglish();
    human.whatTheyWant();

    human.speakEnglish();
    System.out.println();

  }
}

class Human{
  int age;
  int weight;
  String name;

  void setName(String username){
    name=username;
  }

  //без VOID
 int yaerToRelax(){
    int years = 66-age;
    return years;
  }

  public void speakEnglish (){
    System.out.println(name+ "  weight:"+"\n"+ weight+"" + "say---"+ "i love Burger");
  }

  public void whatTheyWant(){
    System.out.println("LIVE");
  }
}
