public class NestVar {
  public static void main(String[] args) {
    int count;
    for (count = 0; count<10; count++);
    //int count;  нельзя обвяить переменную  count, поскольку ранее она уже было объявлено
    //for (count = 0; count<2; count++);
    System.out.println("B этой программе есть ошибка!");
  }
}
