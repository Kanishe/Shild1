package massivrepeat;

public class Multi_arrays {
  public static void main(String[] args) {
    int array []={1,2,3};
    int array2 [][]={{1,3,4},
                     {5,6,7},
                     {10,11,12}};

    for (int i=0;i<array2.length;i++){//внешний цикл
      for (int k=0;k<array2[i].length; k++){//внутренний цикл
        System.out.print(array2[i][k]+" ");// 1 и пробел и тд (1 2 3)
      }
      System.out.println();//печать с  новой строки
    }




    String array3[][]=new String[2][3];
    System.out.println(array3[1][2]);
  }
}
