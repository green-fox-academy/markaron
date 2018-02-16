import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme two numbers, and I'll guess the bigger one: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x > y) {
            System.out.println("That's bigger: " + x);
        } else {
            System.out.println("This one is bigger: " + y) ;
        }
    }
}
