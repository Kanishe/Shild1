package collection.lesson1;

import java.util.ArrayList;
import java.util.List;

public class MassivArry {
  public static void main(String[] args) {
    //ArrayList<Integer> arrayList=new ArrayList<Integer>(); но учитываю конвенцию павильно будет ссылать на интерфейс так:
    List<Integer> arrayList=new ArrayList<Integer>();
    for (int i=0; i<100; i++){
      arrayList.add(i);

    }
    System.out.println(arrayList);

    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(99));


    System.out.println(arrayList.size());
//3 способа пройти по элментам массива
    //№1
    for (int i=0; i<arrayList.size();i++){
      System.out.println(arrayList.get(i));
    }
    //№2

    for (Integer x:arrayList){
      System.out.println(x);
    }
    //№3 (лямбда функции)





  }

}
