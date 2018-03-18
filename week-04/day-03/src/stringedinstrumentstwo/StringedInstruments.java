package stringedinstrumentstwo;

public abstract class StringedInstruments extends Instruments {

  private int numberOfStrings;

  public StringedInstruments(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    String output = name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound();
    System.out.println(output);
  }

  public String sound() {
    String sound = "";
    return sound;
  }
}
