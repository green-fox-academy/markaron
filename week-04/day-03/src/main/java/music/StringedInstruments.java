package main.java.music;

abstract public class StringedInstruments extends Instrument{
  int numberOfStrings;
  String soundOfInstrument;

  public StringedInstruments(int numberOfStrings, String soundOfInstrument) {
    this.numberOfStrings = numberOfStrings;
    this.soundOfInstrument = soundOfInstrument;
  }

  public StringedInstruments() {
  }

  public void play(){
    System.out.println(this.getClass().getName() + " , a " + getNumberOfStrings() + "-stringed instrument that goes " +
    this.sound());
  }

  public void sound(){
    System.out.println(soundOfInstrument);
  }

  public int getNumberOfStrings(){
    return this.numberOfStrings;
  }

}
