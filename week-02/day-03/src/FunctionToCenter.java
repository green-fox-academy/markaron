import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class FunctionToCenter {
     public static void mainDraw(Graphics graphics) {
         // Create a line drawing function that takes 2 parameters:
         // The x and y coordinates of the line's starting point
         // and draws a line from that point to the center of the canvas.
         // Fill the canvas with lines from the edges, every 20 px, to the center.
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for (int i = 0; i < HEIGHT/20; i ++) {
             lineToCenter(0,i*20,graphics);
             lineToCenter(i*20,0,graphics);
             lineToCenter(WIDTH,i*20,graphics);
             lineToCenter(i*20,HEIGHT,graphics);
         }

     }

     public static void lineToCenter (int x, int y, Graphics graphics){
         Color party = new Color(randomWithRange(0,255),randomWithRange(0,255),randomWithRange(0,255));
         graphics.setColor(party);
         graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);

     }
     public static int randomWithRange(int min, int max) {
         int range = (max - min) + 1;
         return (int)(Math.random() * range) + min;
     }

     // Don't touch the code below
     static int WIDTH = 320;
     static int HEIGHT = 343;
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