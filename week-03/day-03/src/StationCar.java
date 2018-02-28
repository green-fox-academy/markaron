public class StationCar {
  public static void main(String[] args) {
    Station patrolStation = new Station();
    Car trabant = new Car();
    System.out.println(trabant.gasAmount);
    System.out.println(patrolStation.gasAmount);
    patrolStation.refill(trabant);
    System.out.println(trabant.gasAmount);
    System.out.println(patrolStation.gasAmount);
  }
}
