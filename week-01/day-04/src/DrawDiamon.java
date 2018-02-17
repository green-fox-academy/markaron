import java.util.Scanner;
public class DrawDiamon {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me, how big your diamond should be?");
        int diaIn = input.nextInt();
        //int diaIn = 6;
        int gap = diaIn;
        int diaTop = diaIn / 2 + 1;
        int j;

        for (int i = 1; i <= diaTop; i++ ) {
            for ( j = 1; j < gap; j++ )
                System.out.print(" ");
            gap--;
            for ( j = 1 ; j <= 2*i - 1 ; j++ )
                System.out.print("*");

            System.out.println("");
        }

        for(int i = diaTop-1 ; i > 0; i --){
            for ( j = 1; j < gap+2; j++ )
                System.out.print(" ");
        gap++;
            for ( j = 1 ; j <= 2 * i - 1 ; j++ )
            System.out.print("*");

            System.out.println("");
    }

    }
}
