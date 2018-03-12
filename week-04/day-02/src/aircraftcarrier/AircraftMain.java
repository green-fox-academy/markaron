package aircraftcarrier;

public class AircraftMain {
  public static void main(String[] args) {
    Carrier myCarrier = new Carrier(2000,1000);
    //List<Aircraft> myPlanes = new ArrayList<>();
    //Aircraft plane1 = new Aircraft();
    myCarrier.addAircraft("F16");

    System.out.println(myCarrier);
  }
}
