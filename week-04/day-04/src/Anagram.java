import java.util.Arrays;

public class Anagram {

  public boolean anagramChecker(String word1, String word2){
    char [] firstWord = word1.replaceAll("[\\s]", "").toCharArray();
    char [] secondWord = word2.replaceAll("[\\s]", "").toCharArray();
    Arrays.sort(firstWord);
    Arrays.sort(secondWord);
    return Arrays.equals(firstWord,secondWord);
  }
}
