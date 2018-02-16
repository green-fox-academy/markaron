import java.util.Scanner;

public class OneTwoALot {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number:");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Sorry, that is not enough for me.");
        } else if (num == 1) {
            System.out.println("That is one.");
        } else if (num == 2) {
            System.out.println("That is two.");
        } else{
            System.out.println("Wow, that's a LOT!");
        }
    }
}
