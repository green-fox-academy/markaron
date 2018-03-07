package main.java.music;

public class ElectricGuitar extends StringedInstruments{

  public ElectricGuitar() {
    super.numberOfStrings = 6;
    super.soundOfInstrument = "Twang";
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    super.soundOfInstrument = "Twang";
  }

  public void sound (){
    System.out.println("Twang");
  }
}
