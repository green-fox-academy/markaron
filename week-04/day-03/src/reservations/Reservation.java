package reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy{
  List<String> daysOfTheWeek = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));

  @Override
  public String getDowBooking() {
    Random random = new Random();
    int randomDay = random.nextInt(6);
    return daysOfTheWeek.get(randomDay);
  }

  @Override
  public String getCodeBooking() {
    String baseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder outputString = new StringBuilder();
    Random ran = new Random();
    while (outputString.length() < 8){
      int randomChar = ran.nextInt(35);
      outputString.append(baseChars.charAt(randomChar));
    }
    String outputCode = outputString.toString();
    return outputCode;
  }
}
