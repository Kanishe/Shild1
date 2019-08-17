public class Help {
  public static void main(String[] args)
    throws java.io.IOException{


      char choice;


      System.out.println("Справка:");
      System.out.println("1.if");
      System.out.println("2.switch");
      System.out.println("Выбере");
      choice = (char) System.in.read();

      System.out.println("\n");
      switch (choice) {
        case '1':
          System.out.println("Инструкция if:\n");
          System.out.println("if(условие)  инструкция");
          break;
        case '2':

          break;
          
        default:
          System.out.println("запрос не найден");
      }
    }
  }
