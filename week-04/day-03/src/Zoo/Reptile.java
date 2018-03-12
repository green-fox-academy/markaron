package Zoo;

public class Reptile extends Animal{
  private String breed= "laying eggs.";

  public Reptile(String name) {
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
