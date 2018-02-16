import java.util.Scanner;

public class PartyIndicator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("It's party time, but is it good enough? \nTell me how many girls and boys came to the party? \nGirls count: ");
        int g = input.nextInt();
        System.out.println("Boys count: ");
        int b = input.nextInt();
        int p = g + b;

        if ( p >= 20 && g == b) {
                System.out.println("~~~ Wow,this is an excellent party!!! ~~~");
            } else if ( g == 0){
                System.out.println("~~~ Pfff, sausage party.. ~~~");
            } else if ( p >= 20 && (g / b) != 1) {
                System.out.println("~~~ Hmmm, quiet cool party this is! ~~~");
            } else if ( p < 20 ) {
                System.out.println("~~~ Average party.... ~~~");
        } else {
            System.out.println("Something is wrong with your numbers.");
        }
    }

}
