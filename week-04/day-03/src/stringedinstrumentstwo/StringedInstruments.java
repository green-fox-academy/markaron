package stringedinstrumentstwo;

public abstract class StringedInstruments extends Instruments {

  private int numberOfStrings;

  public StringedInstruments(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {

  }

  public void sound(){

  }

  public int getNumberOfStrings(){
    return numberOfStrings;
  }
}
