import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class AnimalsAndLegs {

    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens does the farmer have?");
        int chick = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        int pig = scanner.nextInt();

        int legs = (chick * 2) + (pig * 4);
        System.out.println("There are " + legs + " legs on the farm.");
    }
}

