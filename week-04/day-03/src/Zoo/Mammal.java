package Zoo;

public class Mammal extends Animal {
  private String breed= "pushing miniature versions out.";

  public Mammal(String name) {
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
