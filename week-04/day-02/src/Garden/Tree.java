package Garden;

public class Tree {
  private int waterNeed = 10;
  private double waterAbsorb = 0.4;
  private String color;
  private double waterAmount = 0;

  public Tree (String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }

  public void setTreeWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount * waterAbsorb;
  }

  public boolean treeThirsty (){
    if (waterNeed > waterAmount){
      return true;
    }
    return false;
  }


}
