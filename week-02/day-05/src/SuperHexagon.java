import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    //System.out.println("Where is the hexagon?");
    //Scanner input = new Scanner(System.in);
    //int superHexHeight = input.nextInt();
    // int offsetX = input.nextInt();
    // int offsetY = input.nextInt();
    int offsetX = 0;
    int offsetY = 0;
    int offsetYY = 43;
    boolean flipOffsetX = true;
    int superHexHeight = 11;
    int heightCut = 0;

    for (int i = 0; i < superHexHeight+1; i++) {
      for (int j = 0; j < superHexHeight-heightCut; j++) {
        offsetY += 86;
        hexaDraw(graphics, offsetX, offsetY);
      }
      heightCut++;
      offsetY = offsetYY;
      offsetYY += 43;
      if (i >= superHexHeight /2 && flipOffsetX) {
        offsetX = 0;
        offsetY = 0;
        offsetYY = 43;
        flipOffsetX = false;
        heightCut = 0;
      } else if (i >= superHexHeight /2) {
        offsetX -= 75;
      } else {
        offsetX += 75;
      }
    }


  /*  offsetY = 43;
    for (int j = 0; j < 6; j++) {
      offsetX = 75;
      offsetY += 86;
      hexaDraw(graphics,offsetX,offsetY);
    }*/


    //hexaDraw(graphics,offsetX, offsetY);
  }

  public static void hexaDraw(Graphics graphics, int offsetX, int offsetY) {
    int x = 500;  // the half of the canvas size
    int y = 50;
    int[] xPoints = {x - 25 + offsetX, x + 25 + offsetX, x + 50 + offsetX, x + 25 + offsetX,
            x - 25 + offsetX, x - 50 + offsetX};
    int[] yPoints = {y - 43 + offsetY, y - 43 + offsetY, y + offsetY, y + 43 + offsetY,
            y + 43 + offsetY, y + offsetY};
    int numPoints = 6;
    graphics.drawPolygon(xPoints, yPoints, numPoints);

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