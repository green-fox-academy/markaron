import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...


    //int [] test = myDomino.getValues();

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j <1 ; j++) {

      }
      Domino dom1 = dominoes.get(i);
      Domino dom2 = dominoes.get(i+1);
      int dom1Value = dom1.getValues()[0];
      int dom2Value = dom2.getValues()[0];
      if (dom1Value > dom2Value){
        result.add(0,dom2Value);
      }
    }
    System.out.println(result.toString());

    //System.out.println(test[1]);
    //System.out.println(dominoes);
  }
  

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}