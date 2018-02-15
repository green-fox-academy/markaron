import java.util.Scanner;

public class HelloUser {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name stranger?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName +" ! Nice to see you!");

    }
}