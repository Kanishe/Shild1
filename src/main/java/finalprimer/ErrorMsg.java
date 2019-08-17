package finalprimer;

  class ErrorMsg {
  final int  OUTERR = 0;
  final int INNER =1;
  final int DISKERR =2;
  final int INDEXERR =3;
  String msgs [] = {
          "Ошибка вывода",
          "Ошибка ввода",
          "Отсутсвтвует место на диске",
          "Выход индекса за границы диапазона"
  };
//Возврат сообщениня об шибке
  String getErrorMsg(int i){
    if (i>=0 & i<msgs.length)
      return msgs[i];
    else
      return "Не существующий код ошибки";
  }
  static class FinalD{
    public static void main(String[] args) {
      ErrorMsg err =new ErrorMsg();
      System.out.println(err.getErrorMsg(err.OUTERR));
      System.out.println(err.getErrorMsg(err.DISKERR));
    }
  }
}
