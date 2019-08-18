package equalsstringpool;

public class Animal {
  private int id;

  public Animal(int id){
    this.id=id;
  }
  public boolean equals(Object object){
    Animal otherAnimal= (Animal)object;
    return this.id==otherAnimal.id;
  }

}
