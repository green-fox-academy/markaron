package aircraftcarrier;

public class AircraftMain {
  public static void main(String[] args) {
    Carrier myCarrier = new Carrier(2000,1000);
    //List<Aircraft> myPlanes = new ArrayList<>();
    //Aircraft plane1 = new Aircraft();
    myCarrier.addAircraft("F16");
    myCarrier.addAircraft("F13");
    myCarrier.addAircraft("f35");
    System.out.println(myCarrier);
    myCarrier.fill();
    System.out.println(myCarrier);
  }
}
