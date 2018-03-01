import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TheYellowRecursion {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0,0,WIDTH,HEIGHT);

    theYellowThing(graphics,1000,1000);
  }

  public static void theYellowThing (Graphics graphics,int height, int width){
    graphics.setColor(Color.BLACK);
    graphics.drawLine(0,height/3,width,height/3);
    graphics.drawLine(0,(height*2)/3, width,(height*2)/3);
    graphics.drawLine(width/3,0,width/3,height);
    graphics.drawLine((width*2)/3,0,(width*2)/3,height);

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
