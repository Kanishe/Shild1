package glava6;

public class Block {
  int a,b,c;
  int volume;

  Block(int i, int j, int k){
    this.a=i;
    this.b=j;
    this.c=k;
    volume= a*b*c;
  }

  //Использование объектного типа в качестве параметр
  boolean sameBLlock (Block ob){
    if ((ob.a==a)&(ob.b==b)&(ob.c==c))
      return true;
    else return false;
  }
  //Возврат логического значения t rue , если
// параметр оЬ определяет параллелепипед того же объема
  boolean sameVolume(Block ob){
    if ((ob.volume==volume))
      return true;
    else return false;
  }
}
class PassOb{
  public static void main(String[] args) {
    Block ob = new Block(10,2,5);
    Block ob1 = new Block(10,45,5);
    Block ob2 = new Block(3,5,5);

    System.out.println("оb1 имеет те же размеры, что и оЬ2: " +ob.sameBLlock(ob1));
    System.out.println("оb1 имеет те же размеры, что и оЬ2: " +ob.sameVolume(ob2));

  }
}
