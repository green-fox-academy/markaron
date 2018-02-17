import java.util.Scanner;

public class DrawPyramid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How high do you like your pyramids? ");
        int pyHeight = input.nextInt();

        int temp = pyHeight;
        int j;

        for (int i = 1 ; i <= pyHeight ; i++ ) {
            for ( j = 1 ; j < temp ; j++ )
                System.out.print(" ");
            temp--;
            for ( j = 1 ; j <= 2*i - 1 ; j++ )
                System.out.print("*");
            System.out.println("");
        }
    }
}
