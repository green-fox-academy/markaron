import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  private Map<Integer,Character> dictionaryFromWord (String theWord) {
    Map<Integer,Character> dictionary = new HashMap<Integer, Character>();
    for (int i = 0; i <theWord.length() ; i++) {
      Integer key = i;
      char value = theWord.charAt(i);
      dictionary.put(key,value);
    }

    return null;
  }
}
