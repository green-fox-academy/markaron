import java.util.*;

public class Uniqe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    System.out.println("How many numbers do you have for me today?");
//
//    int numSize = scanner.nextInt();
//    int[] numArray = new int[numSize];
//
//    for (int i = 0; i < numArray.length; i++) {
//      System.out.println("Enter the next number:");
//      numArray[i] = scanner.nextInt();
//    }

    List<Integer> numArray = Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34);
    //  System.out.println(uniqe(numArray));
    //  Collections.sort(numArray);
    //  System.out.println((numArray));
  }

  public static List<Integer> uniqe(List<Integer> num) {
    Collections.sort(num);
    List<Integer> duplicateFreeList = Arrays.asList();

    


  }

}