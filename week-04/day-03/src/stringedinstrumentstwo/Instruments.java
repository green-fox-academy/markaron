package stringedinstrumentstwo;

public abstract class Instruments {

  protected String name;

  abstract public void play();

  public void setName(String name) {
    this.name = name;
  }
}
