package main.java.music;

abstract public class StringedInstruments extends Instrument{
  int numberOfStrings;
  String soundOfInstrument;

  public StringedInstruments() {
  }

  public void play(){
    System.out.println(name + " , a " + getNumberOfStrings() + "-stringed instrument that goes " + this.sound());
  }

  public String sound(){
    return soundOfInstrument;
  }

  public int getNumberOfStrings(){
    return this.numberOfStrings;
  }

}
