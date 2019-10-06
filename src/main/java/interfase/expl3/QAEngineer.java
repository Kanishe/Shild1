package interfase.expl3;

public class QAEngineer implements BeerDrink{
  public int testprogramm;


  public QAEngineer(int testprogramm) {
    this.testprogramm = testprogramm;

  }

  public void testing() {
    System.out.println(" Im testing programm");
  }
  public void needlitrbeer(){
    System.out.println(" i need 6 liter beer");
  }
}