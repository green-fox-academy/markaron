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
}
