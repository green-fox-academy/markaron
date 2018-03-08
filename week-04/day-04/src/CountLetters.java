import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public static void main(String[] args) {
    String theWord = "albatross";
    System.out.println(dictionaryFromWord(theWord).toString());
    System.out.println(dictionaryFromWord(theWord).get(2));
  }


  public static Map<Integer,Character> dictionaryFromWord (String theWord) {
    Map<Integer,Character> dictionary = new HashMap<Integer, Character>();
    for (int i = 0; i <theWord.length() ; i++) {
      Integer key = i;
      char value = theWord.charAt(i);
      dictionary.put(key,value);
    }
    return dictionary;
  }
}
