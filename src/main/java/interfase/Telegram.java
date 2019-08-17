package interfase;

public class Telegram implements Messengers{

  public void sendMessage(){
    System.out.println("отправляем сообщение");
  }
  public void getMessage(){
    System.out.println("получаем сообщение");
  }

}
