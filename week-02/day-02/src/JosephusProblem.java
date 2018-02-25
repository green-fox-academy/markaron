import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numOfSoldiers = input.nextInt();
    int[] array = new int[numOfSoldiers];

    for (int i = 0; i < numOfSoldiers ; i+=2) {
      array[i] = 1;
      if (i == numOfSoldiers){
        i = 1;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
