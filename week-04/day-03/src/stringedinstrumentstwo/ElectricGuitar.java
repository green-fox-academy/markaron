package stringedinstrumentstwo;

public class ElectricGuitar extends StringedInstruments {

  public ElectricGuitar() {
  super(6);
  }

  public ElectricGuitar(int newNumberOfStrings) {
    super(newNumberOfStrings);
  }

  @Override
  public String sound(){
    String sound = "Twang";
    return sound;
  }
}
