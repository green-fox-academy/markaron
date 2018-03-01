import java.util.Arrays;

public class SharpieSetMain {
  public static void main(String[] args) {
    SharpieSet mySet = new SharpieSet();
    Sharpie redSharp = new Sharpie("red",20);
    Sharpie whiteSharp = new Sharpie("white",20);
    Sharpie blueSharp = new Sharpie("blue",20);
    mySet.add(redSharp);
    mySet.add(whiteSharp);
    mySet.add(blueSharp);


    System.out.println(whiteSharp.inkAmount);
    whiteSharp.use();
    System.out.println(whiteSharp.inkAmount);
    whiteSharp.use();
    System.out.println(mySet.getCurrent());
    mySet.removeTrash();
    System.out.println(mySet.getCurrent());
  }
}
