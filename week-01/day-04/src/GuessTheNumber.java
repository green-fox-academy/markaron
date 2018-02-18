import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int ranNum = rand.nextInt(50) + 1;
        boolean loser = true;
        System.out.println("## Let's play guess the number! ##");
        System.out.println("Guess between 1 and 50: ");
        int num = input.nextInt();

        while (loser) {
            if(num < 0 || num > 50){
                System.out.println("Remember, guess between 1 and 50.");
            } else if (num == ranNum) {
                System.out.println("~~ YOU WON!! ~~");
                loser = false;
                return;
            } else if (num > ranNum) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("The number is higher.");
            }
            System.out.println("Guess again: ");
            num = input.nextInt();
        }
    }
}
