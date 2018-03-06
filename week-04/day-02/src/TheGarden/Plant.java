package TheGarden;

public class Plant {
  String plantRace;
  String color;
  double waterAmount;
  double waterUsage;
  int waterNeed;

  public void plantFlower (String color){
    Flower flower = new Flower(color);
  }
  public void plantTree (String color){
    Tree tree = new Tree(color);
  }

  public void needsWater(){
    if(this.waterAmount < this.waterNeed ){
      System.out.println("The " + color + plantRace + " needs water.");
    } else {
      System.out.println("The " + color + plantRace + " dosent needs water.");
    }
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount){
    this.waterAmount = waterAmount * waterUsage;
  }
}
