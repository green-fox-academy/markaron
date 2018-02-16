import java.util.Scanner;

public class ParametricAverage {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avr;

                                                                                        //asks how many numbers will be there, the size of the array
        System.out.println("How many numbers do you have for today? Then press enter.");
        int x = scanner.nextInt();

        int [] numList = new int[x];                                                    //stores the size of the array

        for (int i = 0; i < numList.length; i++) {                                      // iterates the input, and adds it up
            System.out.println("Enter the next number:");
            numList[i]= scanner.nextInt();
            sum = sum + numList[i];
        }

        avr = sum / x;                                                                  //average count

        System.out.println("This is the sum of your numbers: "+ sum);
        System.out.println("This is the average of your numbers: " + avr);
    }
}
