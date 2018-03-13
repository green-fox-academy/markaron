package aircraftcarrier;

public class AircraftMain {
  public static void main(String[] args) {
    Carrier carrierRedGun = new Carrier(25,1000);
    Carrier carrierBluePistol = new Carrier(2500,1100);

    carrierRedGun.addAircraft("F16");
    carrierRedGun.addAircraft("F16");
    carrierRedGun.addAircraft("F35");

    System.out.println(carrierRedGun);
    carrierRedGun.fill();
    System.out.println(carrierRedGun);
    carrierRedGun.fight(carrierBluePistol);
  }
}
