import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters countLetters;
  String word;

  @Before
  public void setUp() throws Exception {
    word = "albatross has many wing in the thunderstorm";
    countLetters = new CountLetters();
  }

  @Test
  public void dictionaryFromWord() {
    assertEquals((Character) ('b'),countLetters.dictionaryFromWord(word).get(2));
  }

  @Test
  public void dictionaryWithCharCount(){
    assertEquals((Integer) 3,  countLetters.dictionaryWithCharCount(word).get('a'));
  }

  @Test
  public void dictionaryWithCharCount_spaces(){
    assertEquals((Integer) 6, countLetters.dictionaryWithCharCount(word).get(' '));
  }
}