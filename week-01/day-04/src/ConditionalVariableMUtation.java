import java.util.Scanner;

public class ConditionalVariableMUtation {
    public static void main(String[] args){
        int out = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme a nuber, please, then hit enter.");
        double a = input.nextDouble();

        while ( (a % 2) == 0) {
            out++;
            System.out.println(out);
            System.out.println("What's your next number: ");
            a = input.nextDouble();
        }
            System.out.println("Sorry, that's not even.");

    }
}
