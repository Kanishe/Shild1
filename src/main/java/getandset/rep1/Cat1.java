package getandset.rep1;

import abstractclass.Cat;

public class Cat1 {
  private String catname;
  private int age;
  private int weight;

  public Cat1(String name, int age, int weight){
    this.age=age;
    this.catname =name;
    this.weight=weight;

  }
  public Cat1(){

  }

  public String getCatname() {
    return catname;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setCatname(String catname) {
    this.catname = catname;
  }

  public void CatSay(){
    System.out.println("MAYU" + catname +age+weight);
  }

}
