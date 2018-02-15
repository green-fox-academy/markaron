import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of side 'a': ");
        double a = scanner.nextDouble();
        System.out.println("The length of side 'b': ");
        double b = scanner.nextDouble();
        System.out.println("The length of side 'c': ");
        double c = scanner.nextDouble();

         double x = (a * b) + (a * c) + (b * c);
         double y = a * b * c;


        System.out.println("The surface area for your cuboid is: " + x );
        System.out.println("The volume for your cuboid is: " + y );
        System.out.println("Wicked!");
    }
}
