import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhiteHand extends Card {

  List<Card> list1 = new ArrayList<>(Arrays.asList(
    new Card(2,"C"),
    new Card(3,"H"),
    new Card(4,"S"),
    new Card(8,"C"),
    new Card(A,"H")
  ));

  List<Card> list2 = new ArrayList<>(Arrays.asList(
    new Card(2,"S"),
    new Card(8,"H"),
    new Card(A,"S"),
    new Card(Q,"S"),
    new Card(3,"S")
  ));
}
