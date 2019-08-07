package stringbilder;

public class Lesson23 {
  public static void main(String[] args) {

    StringBuilder stringBuilder=new StringBuilder("hello stringbuilder");
    System.out.println(stringBuilder.toString());
    stringBuilder.append(" my append");
    stringBuilder.append(" doing nothing");
    System.out.println(stringBuilder.toString());



    String stringMutable = "mutable";
    stringMutable.toUpperCase();//  изменения не происходят
    System.out.println(stringMutable);



    stringMutable=stringMutable.toUpperCase();//  изменения происходят
    System.out.println(stringMutable);




  }
}