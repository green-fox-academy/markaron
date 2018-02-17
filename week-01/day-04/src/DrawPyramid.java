import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How high do you like your pyramids? ");
        int pyHigh = input.nextInt();
        for (int i = 1; i < pyHigh; i+=2){
            for (int k=0; k < (pyHigh/2  - i/ 2); k++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
