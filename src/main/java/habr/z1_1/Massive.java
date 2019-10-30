package habr.z1_1;

public class Massive {
  public static void main(String[] args) {
    int [] nums = new int[10];
    int max,min;
    nums  [0]=1;
    nums  [1]=243;
    nums  [2]=65;
    nums  [3]=-5;
    nums  [4]=76;
    nums  [5]=87;
    nums  [6]=345;
    nums  [7]=7;
    nums  [8]=9;
    nums  [9]=0;

    min=max=nums[0];
    for (int i=0; i<nums.length; i++){
      if (nums[i]<min)
        min=nums[i];
      if (nums[i]>max)
        max=nums[i];
    }
    System.out.println("min: "+min+ "\n"+ "max: "+max);

  }
}
