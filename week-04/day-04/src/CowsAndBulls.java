import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  public static void main(String[] args) {
    System.out.println("~~~ Let's play Cows and Bulls! ~~~");
    numberGuesser(randomNumberGenerator());
  }

  public static String randomNumberGenerator(){
    Random r = new Random();
    StringBuilder randomString = new StringBuilder();
    List<Integer> randomList = new ArrayList<>();
    for (int i = 0; i < 4 ; i++) {
      int numberToList = r.nextInt(9);
      while (randomList.contains(numberToList)) {
        numberToList = r.nextInt(9);
      }
      randomString.append(numberToList);
      randomList.add(numberToList);
      }
    String stringList = randomString.toString();
    return stringList;
    }


  public static void numberGuesser(String guessedString){
    boolean gameON = true;
    Scanner input = new Scanner(System.in);
    int numTries = 1;
    while (gameON){
      int bull = 0;
      int cow = 0;
      System.out.println("ˇˇTry " + numTries + "ˇˇ Guess the four numbers, then press enter.");
      String playerGuess = input.nextLine();

      for (int i = 0; i <playerGuess.length() ; i++) {
        if (playerGuess.charAt(i) == guessedString.charAt(i)){
          bull++;
        } else {
          for (int j = 0; j < playerGuess.length() ; j++) {
            if (playerGuess.charAt(i) == guessedString.charAt(j)){
              cow++;
            }
          }
        }
      }
      if (bull == 4) {
        System.out.println("You WON! The number was: " + guessedString + " Your number was: " + playerGuess);
        gameON = false;
      }
      numTries++;
      System.out.println("Bulls: " + bull + " Cows: " + cow);
    }
  }
}
