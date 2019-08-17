package interfase.interface2;

public class Human implements theyCanSay {
  public String name;

  public Human(String name){
    this.name=name;
  }


  @Override
  public void theyCanSay() {
    System.out.println("Hello");
  }
}
