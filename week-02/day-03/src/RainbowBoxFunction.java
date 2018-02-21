 import javax.swing.*;
 import java.awt.*;
 import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class RainbowBoxFunction {
     public static void mainDraw(Graphics graphics) {
         // Create a square drawing function that takes 2 parameters:
         // The square size, and the fill color,
         // and draws a square of that size and color to the center of the canvas.
         // Create a loop that fills the canvas with rainbow colored squares.

         Color myRandomColor =new Color (randomWithRange(0,255),randomWithRange(0,255),randomWithRange(0,255));
         fillMySquare(241,myRandomColor, graphics);
         for (int i = 0; i <50 ; i++) {
             fillTheCanvas(graphics);
         }
     }

     public static void fillMySquare (int size, Color color, Graphics graphics){
         graphics.setColor(color);
         graphics.fillRect((HEIGHT/2)-size/2,(WIDTH/2)-size/2,size,size);

     }
     public static void fillTheCanvas(Graphics graphics){
         int x = randomWithRange(0,WIDTH);
         int y = randomWithRange(0, HEIGHT);
         int sizeX = randomWithRange(0,222);
         int sizeY = randomWithRange(0,222);
         Color rainbowSquares =new Color(randomWithRange(0,255),randomWithRange(0,255),randomWithRange(0,255));
         graphics.setColor(rainbowSquares);
         graphics.fillRect(x,y,sizeX,sizeY);
     }

     public static int randomWithRange(int min, int max)
     {
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
