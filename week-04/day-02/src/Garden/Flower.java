package Garden;

public class Flower {
  private int waterNeed = 5;
  private double waterDrink = 0.75;
  private String color;
  private double waterAmount = 10;

  public Flower(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
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
            "color='" + color + '\'' +
            '}';
  }
}
