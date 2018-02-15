import java.util.Scanner;

public class AvargeOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me the five winning numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int x = a + b + c + d + e;
        System.out.println("Sum: " + x);
        System.out.println("Avarage: " + x / 5);
    }
}
