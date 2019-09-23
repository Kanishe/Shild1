package getandset.rep1;

public class Main {
  public static void main(String[] args) {
    Cat1 cat1=new Cat1();
    cat1.CatSay();
    cat1.setAge(13);
    cat1.setCatname("Басрис1");
    cat1.setWeight(91);
    cat1.CatSay();
    cat1.setAge(123);
    cat1.setCatname("Басрис2");
    cat1.setWeight(666666);
    cat1.CatSay();
  }
}
