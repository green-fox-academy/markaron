public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width){
    inkAmount = 2;
    this.color = color;
    this.width = width;
  }

  public void use(){
    inkAmount--;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
            "color='" + color + '\'' +
            ", width=" + width +
            ", inkAmount=" + inkAmount +
            '}';
  }
}
