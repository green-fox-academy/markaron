import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public static void main(String[] args) {
    String theWord = "albatross";
    System.out.println(dictionaryFromWord(theWord).toString());
    System.out.println(dictionaryFromWord(theWord).get(2));
    System.out.println(dictionaryWithCharCount(theWord).toString());
    System.out.println(dictionaryWithCharCount(theWord).get(0));
  }


  public static Map<Integer,Character> dictionaryFromWord (String theWord) {   //just adds numbers to the words char
    Map<Integer,Character> dictionary = new HashMap<>();
    for (int i = 0; i <theWord.length() ; i++) {
      Integer key = i;
      char value = theWord.charAt(i);
      dictionary.put(key,value);
    }
    return dictionary;
  }

  public static Map<Character,Integer> dictionaryWithCharCount(String theWord) {  //counts the letters occurrence
    Map<Character,Integer> dictionaryCounted = new HashMap<>();
    for (int i = 0; i < theWord.length(); i++) {
      char charAt = theWord.charAt(i);
      if (!dictionaryCounted.containsKey(charAt)){
        dictionaryCounted.put(charAt,1);
      } else {
        dictionaryCounted.put(charAt, dictionaryCounted.get(charAt)+1);
      }
    }
    return dictionaryCounted;
  }
}
