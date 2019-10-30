package habr.z1_1;

public class Bouble {


  public static void main(String[] args) {
    double array[]= {1,34,52,4332423.2,4,253,5234,2};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          double temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
