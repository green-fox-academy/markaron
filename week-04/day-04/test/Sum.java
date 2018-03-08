import java.util.List;

public class Sum {

  int sumOfYourList;

  public int sumOfYourList (List<Integer> numList){
    for (Integer aNumList : numList) {
      sumOfYourList += aNumList;
    }
  return sumOfYourList;
  }
}
