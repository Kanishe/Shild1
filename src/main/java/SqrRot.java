// Вывод квадратных корней чисел от 1 до 99
public class SqrRot {
  public static void main(String[] args) {
    double num,sroot,rerr;
    for (num=1.0; num<100.0;num++){
      sroot=Math.sqrt(num);
      System.out.println("Kopeнь квадратный из  " + num+
              "  равен  " + sroot);
      rerr = num-(sroot*sroot);
      System.out.println("Ошибка округления   " + rerr);
      System.out.println();
    }
  }
}
