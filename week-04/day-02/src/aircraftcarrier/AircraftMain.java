package aircraftcarrier;

public class AircraftMain {
  public static void main(String[] args) {
    Carrier carrierRedGun = new Carrier(25,1000);
    Carrier carrierBluePistol = new Carrier(2500,800);

    carrierRedGun.addAircraft("F16");
    carrierRedGun.addAircraft("F16");
    carrierRedGun.addAircraft("F35");
    carrierRedGun.fill();

    System.out.println(carrierRedGun.fight(carrierBluePistol));
  }
}
