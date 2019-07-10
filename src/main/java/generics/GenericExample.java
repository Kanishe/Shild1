package generics;

public class GenericExample<T> {
  private T value;


  public GenericExample(T value){
    this.value=value;
  }

  public T getT(){
    return value;
  }

  public static void main(String[] args) {
    GenericExample <Integer> intObject= new GenericExample (1);
    Integer valueInteger = intObject.getT();
    GenericExample <String> stringGenericExample= new GenericExample ("d");
    String valueString= stringGenericExample.getT();


  }

}
