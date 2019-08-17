//Демонстрация использования цикла do-while
public class DWDemo {
  public static void main(String[] args)
    throws java.io.IOException{
    char ch;
    do {
      System.out.print("Haжмитe нужную клавишу, а затем\n" +
              "клавишу ENTER : ");
      ch=(char) System.in.read();//чтение символа с клавиатуры
    } while (ch!='q');
  }
}
