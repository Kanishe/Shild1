package Glava5;

public class MinMax2 {
  public static void main(String[] args) {
    int nums[]={99,-10,100032,18,-987,5623,463,-9,287,49};

    int min, max;

    int i;

    min=nums[0];
    max=nums[0];

    for (i=0;i<10;i++){
      if (min<nums[i])min=nums[i];
      if (max>nums[i])max=nums[i];
    }
    System.out.println(min +"\n"+max);
  }
}
