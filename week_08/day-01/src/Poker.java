import java.util.Collections;
import java.util.List;

public class Poker {

  WhiteHand whiteList = new WhiteHand();
  BlackHand blackList = new BlackHand();

  int a = 14;
  int k = 13;
  int q = 12;
  int j = 11;

  public String evaluateWinner(List<Card> whiteList, List<Card> blackList) {
    Collections.reverse(whiteList);
    Collections.reverse(blackList);
    for (int i = 0; i < whiteList.size(); i++) {
      if(whiteList.get(i).getValue() > blackList.get(i).getValue()){
        return "White Wins!" + whiteList.get(i);
      } else if(whiteList.get(i).getValue() < blackList.get(i).getValue()){
        return "Black Wins!";
      }
    }
    return "Tie";
  }
}
