package generics;

public class Main {
  public static void main(String[] args) {

    final  Tuple<String>str2=new Tuple("r","l");
    System.out.println(str2.getLeft());

    final  Tuple <Integer>str3=new Tuple(3,9);
    System.out.println(str3.getRight()+15);


  }

}
