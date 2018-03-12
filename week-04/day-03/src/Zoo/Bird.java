package Zoo;

public class Bird extends Animal {
  private String breed= "laying eggs.";

  public Bird(String name) {
    super.name = name;
  }

  public String getName() {
    return name;
  }

  public String breed() {
    return breed;
  }

  @Override
  public void land() {
    
  }

  @Override
  public void fly() {

  }

  @Override
  public void takeoff() {

  }
}
