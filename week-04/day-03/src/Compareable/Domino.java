package Compareable;

import java.util.Collections;

public class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino Domino) {
    if (values[0] == Domino.values[1])
      return 0;
    else if (values[0] >= Domino.values[1])
      return 1;
    else
      return -1;
  }
}
