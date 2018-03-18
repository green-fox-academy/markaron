package stringedinstrumentstwo;

public class BassGuitar extends StringedInstruments {

  public BassGuitar() {
    super(4);
    setName("Bass Guitar");
  }

  public BassGuitar(int newNumberOfStrings) {
    super(newNumberOfStrings);
    setName("Bass Guitar");
  }

  @Override
  public String sound() {
    String sound = "Duum-duum-duum";
    return sound;
  }


}
