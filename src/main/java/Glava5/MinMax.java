package Glava5;
//Поиск минимального и максимального значений в массиве
public class MinMax {
  public static void main(String[] args) {
    int nums[]=new int [10];

    int min,max;

    int i;



    nums[0]=-99999999;
    nums[1]=-10;
    nums[2]=100123;
    nums[3]=18;
    nums[4]=-987;
    nums[5]=5623;
    nums[6]=463;
    nums[7]=-9;
    nums[8]=287;
    nums[9]=49;

   max=nums[0];
   min=nums[0];


   for (i=0;i<10;i++){
     if (max>nums[i])max=nums[i];
     if (min<nums[i])min=nums[i];
   }

    System.out.println( min + "\n"+max );




  }
}
