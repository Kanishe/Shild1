package interfase.interface2;

public class Cow implements theyCanSay {
  public String name;

  public Cow(String name) {
    this.name = name;
  }

  @Override
  public void theyCanSay() {
    System.out.println("MOOOOOOOO!");
  }
}
