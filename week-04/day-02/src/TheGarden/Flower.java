package TheGarden;

public class Flower extends Plant {

  public Flower(String color) {
    super.waterUsage = 0.75;
    super.waterNeed = 5;
    super.plantRace = "flower";
  }

  @Override
  public String toString() {
    return "Flower{" +
            "plantRace='" + plantRace + '\'' +
            ", color='" + color + '\'' +
            ", waterAmount=" + waterAmount +
            ", waterUsage=" + waterUsage +
            ", waterNeed=" + waterNeed +
            '}';
  }
}
