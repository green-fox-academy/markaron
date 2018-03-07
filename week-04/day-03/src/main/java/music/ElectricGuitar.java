package main.java.music;

public class ElectricGuitar extends StringedInstruments{

  public ElectricGuitar() {
    super.numberOfStrings = 6;
    super.soundOfInstrument = "Twang";
    super.name = "ElectricGuitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    super.soundOfInstrument = "Twang";
    super.name = "ElectricGuitar";
  }

}
