package main.java.music;

public class Violin extends StringedInstruments {

  public Violin() {
    super.numberOfStrings = 4;
    super.soundOfInstrument = "Screech";
    super.name = "Violin";
  }

  public Violin(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    super.soundOfInstrument = "Screech";
    super.name = "Violin";
  }

}




