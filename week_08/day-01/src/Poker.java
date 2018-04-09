import java.util.Collections;
import java.util.List;


public class Poker {
  WhiteHand whiteHand = new WhiteHand();

  int j = 11;
  int q = 12;
  int k = 13;
  int a = 14;


  public String evaluateWinner(List<Card> whiteList, List<Card> blackList) {
    Collections.reverse(whiteList);
    Collections.reverse(blackList);

    // akkor fusson le a magaslap, ha csak az egyik flush igaz

    for (int i = 0; i < whiteList.size(); i++) {
      if (whiteList.get(i).getValue() > blackList.get(i).getValue()) {
        return "White wins! " + cardValueConverter(whiteList.get(i));
      } else if (whiteList.get(i).getValue() < blackList.get(i).getValue()) {
        return "Black wins! " + cardValueConverter(blackList.get(i));
      }
    }
    return "Tie";
  }

  public boolean flushTie(List<Card> whiteList, List<Card> blackList){
    return !flushCheckWhite(whiteList) || !flushCheckBlack(blackList);
  }

  public boolean flushCheckWhite(List<Card> whiteList) {
    for (int i = 0; i < whiteList.size(); i++) {
      String tempColor = whiteList.get(0).getColor();
      if (!whiteList.get(i).getColor().equals(tempColor)) {
        return false;
      }
    }
    return true;
  }

  public boolean flushCheckBlack(List<Card> blackList) {
    for (int i = 0; i < blackList.size(); i++) {
      String tempColor = blackList.get(0).getColor();
      if (!blackList.get(i).getColor().equals(tempColor)) {
        return false;
      }
    }
    return true;
  }

  public String cardValueConverter(Card card) {
    if (card.getValue() == 11) {
      return "Jack";
    } else if (card.getValue() == 12) {
      return "Queen";
    } else if (card.getValue() == 13) {
      return "King";
    } else if (card.getValue() == 14) {
      return "Ace";
    }
    return card.getValue() + "";
  }
}