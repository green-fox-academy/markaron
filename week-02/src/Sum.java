import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you have for me today?");
        int numSize = scanner.nextInt();
        int[] nums = new int[numSize];


        System.out.println("The sum of the numbers are: " + sum(nums));

    }

    public static int sum (int[] value){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < value.length; i++){
            System.out.println("Enter the next number:");
            value[i] = scanner.nextInt();
            sum = sum + value[i];
        }
        return sum;
    }
}
