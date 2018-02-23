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
    int offsetYY = 0;

    for (int i = 0; i < 5 ; i++) {
      if ( i < 3){
        offsetX += 75;
        offsetYY = i * 43;
      }else if ( i == 3){
        offsetX -= 75;
        offsetYY = i * 43;
      }
      for (int j = 0; j < 6 ; j++) {
        if (i == 1 && j >= 5){
          } else if ( i == 2 && j >= 4 ){
        }else {
          offsetY = j * 86 + offsetYY;
        }
       hexaDraw(graphics,offsetX,offsetY);

      }
    }
    
    //hexaDraw(graphics,offsetX, offsetY);
  }

  public static void hexaDraw(Graphics graphics, int offsetX, int offsetY){
    int x = 1000;  // the half of the canvas size
    int y = 90;
    int [] xPoints = {x - 25 + offsetX, x + 25 + offsetX, x + 50 + offsetX, x + 25 + offsetX,
            x - 25 + offsetX, x - 50 + offsetX};
    int [] yPoints = {y - 43 + offsetY, y - 43 + offsetY, y + offsetY, y + 43 + offsetY,
            y + 43 + offsetY, y + offsetY};
    int numPonts = 6;
    graphics.drawPolygon(xPoints, yPoints, numPonts);

  }

  // Don't touch the code below
  static int WIDTH = 2000;
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