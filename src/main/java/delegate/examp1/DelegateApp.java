package delegate.examp1;

public class DelegateApp {
  public static void main(String[] args) {
    A a =new A();
    a.f();


  }
}

class A {
  void f (){
    System.out.println("f");
  }
}

class B {
  A a=new A();
  void f (){
    a.f();
  }
}


