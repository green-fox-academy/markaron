import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics){
    hexaDraw(graphics);
  }

  public static void hexaDraw(Graphics graphics){
    int [] xPoints = {WIDTH/2 - 50, WIDTH/2 + 50, WIDTH/2 + 100, WIDTH/2 + 50, WIDTH/2 - 50, WIDTH/2 - 100};
    int [] yPoints = {HEIGHT/2 - 86, HEIGHT/2 - 86, HEIGHT/2, HEIGHT/2 +86, HEIGHT/2 + 86, HEIGHT/2 };
    int numPonts = 6;
    graphics.drawPolygon(xPoints, yPoints, numPonts);

  }

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}