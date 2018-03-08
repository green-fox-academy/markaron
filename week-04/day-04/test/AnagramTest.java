import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram;
  String word1;
  String word2;

  @Before
  public void setUp() throws Exception {
    anagram = new Anagram();
    word1 = "majom";
    word2 = "jomam";
  }

  @Test
  public void anagramChecker() {
    assertTrue(anagram.anagramChecker(word1,word2));
  }
}