package exeption.example2;

public class Exeption2 {
  public static void main(String[] args) {
    int  m [] =  {4,8,16,32,64,128};
    int  denom [] =  {2,0,4,4,0,8};

    for (int i=0; i< m.length; i++){
      try {
      System.out.println(m[i]+"/"+denom[i]+"equal"+m[i]/denom[i]);
    }catch (ArithmeticException e){
        System.out.println("division by zero attempt");
      }
    }
  }
}
