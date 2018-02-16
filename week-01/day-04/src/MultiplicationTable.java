import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Which number would you like to multiply?");
        int multi = input.nextInt();

        while (i < 11){
            System.out.println( i + "*" + multi + "=" + i * multi);
            i++;
        }
    }
}
