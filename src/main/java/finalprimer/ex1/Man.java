package finalprimer.ex1;
//todo final https://www.youtube.com/watch?v=em6TpQd1v1o
public class Man {
  public static void main(String[] args) {
    final int age=3;
  }

  class One{
    final void method(){
      System.out.println("one");
    }
  }
  class Two extends One{
   //Если откоментить то получим ошибку так как метод в предыдущем шаге обозначен как ФИНАЛЬНЫЙ
    // void method(){
     // System.out.println("two");
    }
  }

