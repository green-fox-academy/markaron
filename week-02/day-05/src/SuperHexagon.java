import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics){
    // System.out.println("Where is the hexagon?");
    // Scanner input = new Scanner(System.in);
    // int offsetX = input.nextInt();
    // int offsetY = input.nextInt();
    int offsetX = 0;
    int offsetY = 0;
    hexaDraw(graphics,offsetX, offsetY);
  }

  public static void hexaDraw(Graphics graphics, int offsetX, int offsetY){
    int [] xPoints = {WIDTH/2 - 50 + offsetX, WIDTH/2 + 50 + offsetX, WIDTH/2 + 100 + offsetX, WIDTH/2 + 50 + offsetX,
            WIDTH/2 - 50 + offsetX, WIDTH/2 - 100 + offsetX};
    int [] yPoints = {HEIGHT/2 - 86 + offsetY, HEIGHT/2 - 86 + offsetY, HEIGHT/2 + offsetY, HEIGHT/2 +86 + offsetY,
            HEIGHT/2 + 86 + offsetY, HEIGHT/2 + offsetY};
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