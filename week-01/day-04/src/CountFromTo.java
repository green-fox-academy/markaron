import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number you like, then press enter: ");
        int firstNum = input.nextInt();
        System.out.println("Thanks! Now give me another number please and press enter: ");
        int secNum = input.nextInt();

        if (firstNum > secNum) {
            System.out.println("No good, the second number should be bigger!");
        } else {
            while(secNum > firstNum){
                System.out.println("~ " + firstNum + " ~");
                firstNum++;
            }
        }

    }
}
