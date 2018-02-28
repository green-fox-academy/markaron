public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width){
    inkAmount = 2;
  }

  public void use(){
    inkAmount--;
  }

}
