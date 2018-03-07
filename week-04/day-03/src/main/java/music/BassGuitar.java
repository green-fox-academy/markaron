package main.java.music;

public class BassGuitar extends StringedInstruments {

  public BassGuitar() {
    super.numberOfStrings = 4;
    super.soundOfInstrument = "Duum-duum-duum";
    super.name = "Bass Guitar";
  }

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    super.soundOfInstrument = "Duum-duum-duum";
    super.name = "Bass Guitar";
  }

}


