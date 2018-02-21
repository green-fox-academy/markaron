import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        graphics.drawRect(0,0,WIDTH,HEIGHT);
        int blockSize= 20;
        int xPos = 0;
        int xPosOffset = 0;

        for (int i = 0; i < HEIGHT/blockSize; i++) {
            for (int j = 0; j <= WIDTH/blockSize ; j++) {
                if (i % 2 == 0){
                    xPosOffset = blockSize;
                } else{
                    xPosOffset = 0;
                }
                graphics.setColor(Color.BLACK);
                graphics.fillRect(j*(blockSize*2)+xPosOffset,i*blockSize,blockSize,blockSize);
                xPos += blockSize;
            }
        }

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