package TheGarden;

public class Tree extends Plant{

  public Tree(String color) {
    super.waterUsage = 0.4;
    super.waterNeed = 10;
    super.plantRace = "tree";
  }

  @Override
  public String toString() {
    return "Tree{" +
            "plantRace='" + plantRace + '\'' +
            ", color='" + color + '\'' +
            ", waterAmount=" + waterAmount +
            ", waterUsage=" + waterUsage +
            ", waterNeed=" + waterNeed +
            '}';
  }
}
