package reservations;

public class Reservationmain {
  public static void main(String[] args) {
    Reservation myRes = new Reservation();
    System.out.println("Booking# " + myRes.getCodeBooking() + " for " + myRes.getDowBooking());
  }
}
