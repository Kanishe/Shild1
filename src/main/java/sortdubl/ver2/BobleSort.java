package sortdubl.ver2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BobleSort {
  public static void main(String[] args) {
    int[] array = {1, 2, 9, 8, 7, 6, 5, 4, 3};
    int per;
    boolean isSorted = false;
    while (!isSorted) {
      isSorted=true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          isSorted=false;
          per = array[i];
          array[i] = array[i + 1];
          array[i + 1] = per;
        }
        System.out.println(Arrays.toString(array));
      }
    }
  }
}
