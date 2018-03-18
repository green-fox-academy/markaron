package stringedinstrumentstwo;

public abstract class StringedInstruments extends Instruments {

  private int numberOfStrings;

  public StringedInstruments(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String play() {
    return sound();
  }

  public String sound(){
    String sound = "";
    return sound;
  }

  public int getNumberOfStrings(){
    return numberOfStrings;
  }
}
