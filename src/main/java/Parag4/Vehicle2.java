package Parag4;

class Vehicle2 {
  int passengers;//количество пассажиров
  int fuelcap;//емкость топливного бака
  int mpg;//потребление топлива в милях на галлон

  //Возврат дальности поездки
  int range () {
   return mpg * fuelcap;
  }
}
