package repeatmetod.repmethod;

public class Humenity {
  public static void main(String[] args) {
    Programmer programmer1=new Programmer();
    programmer1.levelskills="ОБОЛДЕННЫЙ УРОВЕНЬ";
    programmer1.setHand(10,"ну нормльный такой уровень");
    programmer1.Coding();
    programmer1.howManyProgrammCreate();
    System.out.print("How many program need to do for have 10 hand?"+"\n"+ programmer1.howManyProgrammCreate());
    System.out.print("How many program need to do for have 10 hand?"+"\n"+ programmer1.hand+programmer1.levelskills);

  }
}
