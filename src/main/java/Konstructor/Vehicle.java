package Konstructor;

public class Vehicle {
  int passsengers;
  int fuel;
  int mpg;

  Vehicle (int p, int f, int m){
    this.passsengers=p;
    this.fuel=f;
    this.mpg=m;
  }


  int range (){
    return mpg*fuel;
  }

  double fuelneed (int miles){
    return (double) miles/mpg ;
  }

}
