import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){

    graphics.drawLine(300,0,600,520);
    graphics.drawLine(600,520,0,520);
    graphics.drawLine(0,520,300,0);
    int x1 = 0;
    int y1 = 520;
    int x2 = 600;
    int y2 = 520;

    for (int i = 0; i <26 ; i++) {
      x1 += 15;
      x2 -= 15;
      y1 -= 26;
      y2 -= 26;
      graphics.drawLine(x1,y1,x2,y2);
    }

    x1 = 26;
    y1 = 520;
    x2 = 313;
    y2 = 26;
    graphics.drawLine(x1,y1,x2,y2);
    for (int i = 0; i <19 ; i++) {
      x1 += 30;
      x2 += 15;
      y2 += 26;
      graphics.drawLine(x1,y1,x2,y2);
    }
    x1 = 28;
    y1 = 520;
    x2 = 15;
    y2 = 494;
    graphics.drawLine(x1,y1,x2,y2);
    for (int i = 0; i <18 ; i++) {
      x1 += 30;
      x2 += 15;
      y2 -= 26;
      graphics.drawLine(x1,y1,x2,y2);
    }


  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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