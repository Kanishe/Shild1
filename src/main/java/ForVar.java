// Объявление переменной цикла в самом цикле for

public class ForVar {
  public static void main(String[] args) {
    int sum = 0;
    int fact =1;
    int fact2=2;

    //Вычисление факториала чисел от 1 до 5

    for (int i = 1; i<=5; i++){ // переменная i объявляется в самом цикле fоr
      sum+=i;
      fact*=i;
      fact2=5;
    }
    System.out.println(" Сумма: " + sum);
    System.out.println("Факториал:" + fact + ""+ fact2);
  }
}
