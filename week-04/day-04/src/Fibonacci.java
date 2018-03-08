import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

  public static void main(String[]args){
    int num = 10;
    System.out.println(getFibonacciMemberByIndex(num));
  }

  public static Integer getFibonacciMemberByIndex (int indexInput){
    List<Integer> fibNum = new ArrayList<>(Arrays.asList(0,1));
    for (int i = 2; i < indexInput ; i++) {
      fibNum.add(i, fibNum.get(i-1) + fibNum.get(i-2));
    }
    return fibNum.get(indexInput-1);
  }
}
