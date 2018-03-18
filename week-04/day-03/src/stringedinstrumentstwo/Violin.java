package stringedinstrumentstwo;

public class Violin extends StringedInstruments {

  public Violin() {
    super(4);
    setName("Violin");
  }

  public Violin(int newNumberOfStrings) {
    super(newNumberOfStrings);
    setName("Violin");
  }

  public String sound() {
    String sound = "Screech";
    return sound;
  }
}
