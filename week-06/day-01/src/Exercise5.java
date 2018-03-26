import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
    List<String> string = new ArrayList<>(Arrays.asList("bla", "bLa", "BlA"));
    String word = "bLa";


    System.out.println(word.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .collect(Collectors.joining(", ")));
  }
}
