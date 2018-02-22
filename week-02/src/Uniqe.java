import java.util.*;

public class Uniqe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("How many numbers do you have for me today?");
    int listSize = scanner.nextInt();
    //int[] numArray = new int[numSize];
    List<Integer> numList = new ArrayList<>();
    for (int i = 0; i < listSize;i++) {
      System.out.println("Enter the next number:");
      numList.add(scanner.nextInt());
    }

//    List<Integer> numArray = Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34);
    uniqe(numList);
  }

  public static void uniqe (List<Integer> num) {
    String out = " ";
    Collections.sort(num);
    StringBuilder list = new StringBuilder();
    for (int i = 0; i <num.size()-1 ; i++) {
      if( num.get(i) != num.get(i+1)) {
        list.append(num.get(i) + ",");
      }
    }
    list.append(num.get(num.size()-1));
    out = list.toString();
    System.out.println("This is the new list, without duplicates: " + out);
  }

}