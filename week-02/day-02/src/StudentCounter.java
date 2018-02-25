import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentCounter {
  public static void main(String[] args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add( row0 );

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add( row1 );

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add( row2 );

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add( row3 );

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add( row4 );

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add( row5 );

    // Display the following things:
    //  - Who has got more candies than 4 candies
    //  - Sum the age of people who have lass than 5 candies
    System.out.println("They have more than 4 candies: ");

    for (int i = 0; i < map.size() ; i++) {
      Map<String, Object> element = map.get(i);
      int candies = (int) element.get("candies");
      if (candies > 4) {
        System.out.println(element.get("name"));
      }
    }

      System.out.println("This is the sum of the age for those who have less than 5 candies: ");
      double sum = 0;
      for (int j = 0; j < map.size() ; j++) {
        Map<String, Object> elements = map.get(j);
        int candies = (int) elements.get("candies");
        double age = (double) elements.get("age");

        if (candies < 5){
          sum +=  age;
        }
        }
    System.out.println(sum);


    for (int i = 0; i < map.size() ; i++) {
      Map<String, Object> element = map.get(i);
      System.out.println(element);
      System.out.println(element.get("name"));

    }

  }
}
