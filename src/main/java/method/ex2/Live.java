package method.ex2;

public class Live {
  public static void main(String[] args) {
    Human human=new Human();
    Human human2=new Human();

    human.weight=13;
    human.age=26;
    human.Name="Billy";
    human2.weight=123;
    human2.age=36;
    human2.Name="Bob";

    human.speakEnglish();
    human2.speakEnglish();
    human.whatTheyWant();

    int year1=human.yaerToRelax();
    int year2=human2.yaerToRelax();
    System.out.println();

  }
}

class Human{
  int age;
  int weight;
  String Name;

  //без VOID
 int yaerToRelax(){
    int years = 66-age;
    return years;
  }

  public void speakEnglish (){
    System.out.println(Name+ "  weight:"+"\n"+ weight+"" + "say---"+ "i love Burger");
  }

  public void whatTheyWant(){
    System.out.println("LIVE");
  }
}
