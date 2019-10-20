package javarash.level2.lev2les10;

public class BridgeOfficer {
  int maxWeight;
  public BridgeOfficer(int normalVolume){
    this.maxWeight=normalVolume;
  }
  public boolean checkTruck(Truck truck){
    if (truck.width>maxWeight){
      System.out.println("Разворачивайся, перевес!");
      return false;
    }else {
      System.out.println("Порядок, проезжай!");
      return true;
    }
  }

  public static void main(String[] args) {
    Truck firstTrack=new Truck();
    firstTrack.width=10000;
    Truck secondTrack=new Truck();
    secondTrack.width=20000;

    BridgeOfficer bridgeOfficer=new BridgeOfficer(15000);
    System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
    boolean canFirstTruckGo=bridgeOfficer.checkTruck(firstTrack);
    System.out.println(canFirstTruckGo);


    System.out.println("Грузовик номер 2! Могу я проехать, офицер?");
    boolean canSecondTruckGo=bridgeOfficer.checkTruck(secondTrack);
    System.out.println(canSecondTruckGo);

  }
}
