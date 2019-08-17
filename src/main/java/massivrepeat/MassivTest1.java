package massivrepeat;

public class MassivTest1 {
  public static void main(String[] args) {
    int array []= new int[10];
    int a = 5;

    for (int i=0;i<array.length;i++){
      array[i]= (a+1)*10;
      System.out.println(array[i]);
    }

  }
}
