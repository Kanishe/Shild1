package collection.l2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LkD {
  public static void main(String[] args) {
    List<Integer> list1 =new LinkedList<>();
    List<Integer> list2=new ArrayList<>();
    measureTime(list1);
    measureTime(list2);
  }

  private static void measureTime(List<Integer> list){
    long start = System.currentTimeMillis();

    for (int i=0; i<=70000;i++){
      list.add(i);
    }
    long end = System.currentTimeMillis();

    System.out.println(end-start);
  }
}
