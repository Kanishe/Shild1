package glava6;

public class Test {
  int a,b;

  Test(int i, int j){
    a=i;
    b=j;
  }

//Передача объекта методу .
// Теперь переменные ob.a и ob.b объекта,
// используемого при вызове, также будут изменяться

  void chenge (Test ob){
    ob.a= ob.a+ob.b;
    ob.b=-ob.b;
  }
class CallByRef{
  public void main(String[] args) {
    Test ob=new Test(15, 20);
    ob.chenge(ob);
  }
}
}
