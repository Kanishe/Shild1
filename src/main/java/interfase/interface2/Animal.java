

package interfase.interface2;
public class Animal implements Info {
  public int id;


  public void showInfo(){
    System.out.println("id is"+ this.id);
  }

  public Animal (int id){
    this.id=id;
  }

  public void sleep(){
    System.out.println("sleeping");
  }
}
