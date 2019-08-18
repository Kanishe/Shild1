package exeption;


public class Main {
  public static void main(String[] args) {
    ErrorExapleNullPoiter errorExapleNullPoiter =new ErrorExapleNullPoiter();
    try {
      errorExapleNullPoiter.show();
      System.err.println(1/0);
    }catch (NullPointerException  e){
      e.printStackTrace();
    }

  }
  }

