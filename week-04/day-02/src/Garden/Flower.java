package Garden;

public class Flower {
  private int waterNeed = 5;
  private double waterAbsorb = 0.75;
  private String color;
  private double waterAmount = 0;

  public Flower(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setFlowerWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount * waterAbsorb;
  }

  public boolean flowerThirsty (){
    if (waterNeed > waterAmount){
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "Flower{" +
            "color ='" + color + '\''
            + "water = " + waterAmount +
            '}';
  }
}
