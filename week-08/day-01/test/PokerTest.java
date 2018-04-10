import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {


  Poker poker = new Poker();
  int j = 11;
  int q = 12;
  int k = 13;
  int a = 14;

  @Test
  public void evaluateWinnerTest() {
    List<Card> whiteInput = Arrays.asList(new Card(k, "H"));
    List<Card> blackInput = Arrays.asList(new Card(0, "H"));
    String expectedOutput = "White wins! " + "King";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateBlackWinnerTest() {
    List<Card> whiteInput = Arrays.asList(new Card(k, "H"));
    List<Card> blackInput = Arrays.asList(new Card(a, "H"));
    String expectedOutput = "Black wins! " + "Ace";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateBlackWinnerTest2() {
    List<Card> whiteInput = Arrays.asList(new Card(2, "H"));
    List<Card> blackInput = Arrays.asList(new Card(3, "H"));
    String expectedOutput = "Black wins! " + "3";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateWhiteWinnerWithListTest() {
    List<Card> whiteInput = Arrays.asList(
      new Card(2, "C"),
      new Card(3, "H"),
      new Card(4, "S"),
      new Card(8, "C"),
      new Card(Card.A, "H")
    );
    List<Card> blackInput = Arrays.asList(
      new Card(2, "H"),
      new Card(3, "D"),
      new Card(5, "S"),
      new Card(9, "C"),
      new Card(Card.K, "D")
    );
    String expectedOutput = "White wins! " + "Ace";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateTieWithListTest() {
    List<Card> whiteInput = Arrays.asList(
      new Card(2, "C"),
      new Card(3, "H"),
      new Card(4, "S"),
      new Card(8, "C"),
      new Card(Card.A, "H")
    );
    List<Card> blackInput = Arrays.asList(
      new Card(2, "H"),
      new Card(3, "D"),
      new Card(5, "S"),
      new Card(9, "C"),
      new Card(Card.A, "D")
    );
    String expectedOutput = "Black wins! " + "9";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateTieWithListTest2() {
    List<Card> whiteInput = Arrays.asList(
      new Card(2, "C"),
      new Card(3, "H"),
      new Card(4, "S"),
      new Card(8, "C"),
      new Card(Card.A, "H")
    );
    List<Card> blackInput = Arrays.asList(
      new Card(2, "H"),
      new Card(3, "D"),
      new Card(4, "S"),
      new Card(8, "C"),
      new Card(Card.A, "D")
    );
    String expectedOutput = "Tie";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }

  @Test
  public void evaluateFlush1Test() {
    List<Card> whiteInput = Arrays.asList(
      new Card(2, "H"),
      new Card(3, "H"),
      new Card(4, "H"),
      new Card(8, "H"),
      new Card(Card.A, "H")
    );
    List<Card> blackInput = Arrays.asList(
      new Card(2, "H"),
      new Card(3, "D"),
      new Card(4, "S"),
      new Card(8, "C"),
      new Card(Card.K, "D")
    );
    String expectedOutput = "White Wins! " + "Flush: A";
    String output = poker.evaluateWinner(whiteInput, blackInput);
    assertEquals(expectedOutput, output);
  }
}