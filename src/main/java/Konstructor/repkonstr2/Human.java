package Konstructor.repkonstr2;

  class Human {
  private String name;
  private int age;

  Human(){
    System.out.println("1 конструктор");
  }

  Human(String name){
    System.out.println("2ой конструктор");
  }

  Human(String name, int age){
    System.out.println("3ий конструктор");
  }
}
