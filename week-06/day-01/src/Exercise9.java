import java.util.stream.Collectors;

public class Exercise9 {
  //Write a Stream Expression to convert a char array to a string!
  public static void main(String[] args) {
    char[] letters = {'r', 'e', 's','t','a','n','d','e','a','t'};

    String sentence = new String(letters);
    System.out.println(sentence);
  }
}
