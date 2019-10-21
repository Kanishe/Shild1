package javarash.level2.lev2les10.task2;

public class Jarvis {
  public void sayHi(String firstGuset){
    System.out.println("Good evening " + firstGuset + ", how are you?");
  }

  public void sayHi(String firstGuset, String secondGuest) {
    System.out.println("Good evening " + firstGuset +"  "+ secondGuest + ", how are you?");
  }

  public void sayHiToAll(String...names){
    for (String name: names){
      System.out.println("Hi  " + name);
    }


  }

    public static void main(String[] args) {
    Jarvis jarvis = new Jarvis();
    jarvis.sayHi("Tony");
    jarvis.sayHi("Tony","Cap");
    jarvis.sayHiToAll("Tony","Mamba","Han");

  }
}
