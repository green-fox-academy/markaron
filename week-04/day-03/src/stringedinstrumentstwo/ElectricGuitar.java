package stringedinstrumentstwo;

public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar() {
    super(6);
    setName("Electric Guitar");
  }

  public ElectricGuitar(int newNumberOfStrings) {
    super(newNumberOfStrings);
    setName("Electric Guitar");
  }

  @Override
  public String sound() {
    String sound = "Twang";
    return sound;
  }
}
