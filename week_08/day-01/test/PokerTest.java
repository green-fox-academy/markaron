import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {

  Poker poker = new Poker();

  int a = 14;
  int k = 13;
  int q = 12;
  int j = 11;

  @Test
  public void evaluateWinnerTest(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(a));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(0));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "White Wins!";
    assertEquals(expectedOutput,output);
  }

  @Test
  public void evaluateBlackWinnerTest(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(k));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(a));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "Black Wins!";
    assertEquals(expectedOutput,output);
  }

  @Test
  public void evaluateBlackWinnerTest_2(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(2));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(3));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "Black Wins!";
    assertEquals(expectedOutput,output);
  }

  @Test
  public void evaluateWhiteWinnerBigListTest(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(2,3,4,8,a));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(2,3,5,9,k));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "White Wins!";
    assertEquals(expectedOutput,output);
  }

  @Test
  public void evaluateTieWithListTest(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(2,3,4,8,k));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(2,3,5,9,k));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "Black Wins!";
    assertEquals(expectedOutput,output);
  }

  @Test
  public void evaluateTieWithListTest2(){
    List<Integer> whiteInput = new ArrayList<>(Arrays.asList(2,3,4,8,k));
    List<Integer> blackInput = new ArrayList<>(Arrays.asList(2,3,4,8,k));
    String output = poker.evaluateWinner(whiteInput,blackInput);
    String expectedOutput = "Tie";
    assertEquals(expectedOutput,output);
  }
}