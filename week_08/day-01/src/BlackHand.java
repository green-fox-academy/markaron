import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackHand extends Card {

  List<Card> list1 = new ArrayList<>(Arrays.asList(
    new Card(2,"H"),
    new Card(3,"D"),
    new Card(5,"S"),
    new Card(9,"C"),
    new Card(K,"D")
  ));

  List<Card> list2 = new ArrayList<>(Arrays.asList(
    new Card(2,"H"),
    new Card(4,"S"),
    new Card(4,"C"),
    new Card(2,"D"),
    new Card(4,"H")
  ));
}
