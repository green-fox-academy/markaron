import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MileToKmConverter {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your number?");
        int km = scanner.nextInt();
        //0.621371
        System.out.println(km);

    }
}

