package ImplementCharSequence;

public class Shifter implements CharSequence {
  String word;
  int adder;

  public Shifter(String word, int adder) {
    this.word = word;
    this.adder = adder;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public char charAt(int index) {
    return word.charAt(index + adder);
  }
}
