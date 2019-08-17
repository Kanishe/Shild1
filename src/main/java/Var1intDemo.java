// Демонстрация времени жизни переменной
public class Var1intDemo {
  public static void main(String[] args) {
    int x;
    for (x=0;x<3;x++){
      int y = -1;// переменная у инициализируется при каждом входе в блок
      System.out.println("y: "+ y); // всегда выводится значение -1
      y = 100;
      System.out.println(" Changes parm y:" + y);
    }
  }
}
