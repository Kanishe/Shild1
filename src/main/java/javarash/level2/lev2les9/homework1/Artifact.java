package javarash.level2.lev2les9.homework1;

/**
 * Твоя задача — спроектировать класс Artifact.
 * Артефакты, которые хранятся в музее, бывают трех видов.
 * Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
 * Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
 * Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).
 */

public class Artifact {

  int id;
  String name;
  int age;


  public Artifact(int id){
    this.id=id;
  }

  public Artifact(int id, String name){
    this.id=id;
    this.name=name;
  }

  public Artifact(int id, String name, int age){
    this.id=id;
    this.name=name;
    this.age=age;
  }


  public static void main(String[] args) {

    Artifact artifact1=new Artifact(21234);
    Artifact artifact2=new Artifact(212, "Ацтеки");
    Artifact artifact3=new Artifact(1223, "Maya", 954);


    System.out.println(artifact1.id + artifact1.name);
    System.out.println(artifact2.id + artifact2.name);
    System.out.println(artifact3.id + artifact3.name + artifact3.age);
  }
}
