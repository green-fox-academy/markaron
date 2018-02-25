import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How big is the party?");
    int numOfSoldiers = input.nextInt();
    int[] array = new int[numOfSoldiers];

    for (int i = 0; i < numOfSoldiers ; i+=2) {
      array[i] = 1;
    }
    System.out.println(Arrays.toString(array));

    if (array[numOfSoldiers-1] == 1 ){
      for (int i = 0; i < numOfSoldiers; i++) {
        array[i]++;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
