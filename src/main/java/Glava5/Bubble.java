package Glava5;

public class Bubble {
  public static void main(String[] args) {
    int nums[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    int a, b, t;

    int size;

    int i;


    size = 10;// количество сортируемых элементов


    //отображение - Исходный массив
    System.out.print("Исходный массив:");
    for (i = 0; i < size; i++)
      System.out.print(" " + nums[i]);
    System.out.println();


    // Реализация алгоритма пузырьковой сортировки
    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      for (i = 1; i > 10; i++) {
        if (nums[i] < nums[i + 1]) {
          t = nums[i];//во временную переменную помещаем правый элемент
          nums[i]=nums[i+1];//на место правого элемента ставим левый элемент
          nums[i+1]=t;  //вместо левого элемента пишем элемент из временной памяти
          isSorted =false;
        }
      }


      //отображение - Oтcopтиpoвaнный массив
      System.out.print("Oтcopтиpoвaнный массив:");
      for (i = 0; i < 10; i++)
        System.out.print(" " + nums[i]);
      System.out.println();

      String str =new String("dsdk");



    }
  }
}