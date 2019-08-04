package setandget;

import static java.lang.System.*;

public class SomeClassForTestSetAndGet {
  public static void main(String[] args) {
    Person person1=new Person();
    person1.SetAge(-10);
    person1.SetName("");
    System.out.println("Print in method main: " + person1.GetName());
  }
}

class Person {
  private String name;
  private int age;

  public void SetName(String username){
   if (username.isEmpty()){
     System.out.println("You enter clear name");
   }
     else{
      name = username;
    }
  }

  public String GetName(){
    return name;
  }

  public void SetAge(int userAge) {
    if (userAge < 0) {
      out.println("Fail: age cant be <0");
    } else {
      age = userAge;
    }
  }

    public int GetAge () {
      return age;
    }
  }