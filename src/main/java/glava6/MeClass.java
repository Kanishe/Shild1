package glava6;
// Сравнение модификаторов доступа puЬlic и private
class MeClass {
  private int alpha;// закрытый доступ
  public int beta;// открытый доступ
  int gamma;// тип доступа по умолчанию (по сути, puЬlic)

  // Методы доступа к переменной alpha. Члены класса могут
  // обращаться к закрытым членам того же класса .


 void setAlpha(int a){
  alpha=a;
}
int getAlpha(){
  return alpha;
}
}
