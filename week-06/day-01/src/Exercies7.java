import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Exercies7 {
  public static void main(String[] args) {
    String word = "New York London Paris Berlin";

    Map<Character,Long> characterFrequency = word.chars()
            .mapToObj(c ->(char)c)
            .collect(groupingBy(c ->c,counting()));
    System.out.println(characterFrequency);
  }
}
