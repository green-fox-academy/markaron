import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int [][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};

        //box[0] = {10, 10}

        //box[3] = {10, 290}
        //box[3][0] = 10
        //box[3][1] = 290


        int [][] line = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                        {120, 100}, {85, 130}, {50, 100}};
        functionThatTakesOneParameter(box,graphics);
        functionThatTakesOneParameter(line,graphics);
    }


    public static void functionThatTakesOneParameter (int[][] coord, Graphics graphics){
            for (int i = 0; i < coord.length-1; i++) {
                    graphics.drawLine(coord[i][0],coord[i][1],coord[i+1][0],coord[i+1][1]);
            }
           // graphics.drawLine(coord[][0],coord[i][1],coord[i+1][0],coord[i+1][1]);

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


// create a 300x300 canvas.
