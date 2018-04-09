public class Card {
  public static int J = 11;
  public static int Q = 12;
  public static int K = 13;
  public static int A = 14;


  private int value;
  private String color;

  public Card() {
  }

  public Card(int value, String color) {
    this.value = value;
    this.color = color;
  }

  public int getValue() {
    return value;
  }

  public String getColor() {
    return color;
  }
}