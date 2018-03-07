package ImplementCharSequence;

public class GnirtsMain {
  public static void main(String[] args) {
    Gnirts word = new Gnirts("Jekatyerinburg");

    System.out.println(word.length());
    System.out.println(word.charAt(5));
    System.out.println(word.subSequence(2,5));
  }
}
