import java.util.Scanner;

public class DrawTriangle {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number for your triangle, then press enter.");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
