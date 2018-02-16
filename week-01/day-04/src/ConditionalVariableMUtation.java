import java.util.Scanner;

public class ConditionalVariableMUtation {
    public static void main(String[] args){

        //1.
        int out = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Gimme a number, please, then hit enter.");
        double a = input.nextDouble();

        while ( (a % 2) == 0) {
            out++;
            System.out.println(out);
            System.out.println("What's your next number: ");
            a = input.nextDouble();
        }
            System.out.println("Sorry, that's not even. Next game. Please enter a number.");

        //2.
        int b = input.nextInt();
        String out2 = "";
        if ((b >= 10) && (b <= 20)) {
            out2 = "Sweet!";
            System.out.println(out2);
        } else if (b < 10){
            out2 = "Less!";
            System.out.println(out2);
        } else {
            out2 = "More!";
            System.out.println(out2);
        }

        System.out.println("Next exercise.");

        //3.
        int c = 123;
        boolean isBonus = false;
        boolean bonusInputConvert = true;

        System.out.println("How much are the credits?");
        int credits = input.nextInt();

        System.out.println("Is this a bonus? y / n");
        String bonus = input.next();

        while(bonusInputConvert) {
            if (bonus.equals("y")) {
                isBonus = true;
                bonusInputConvert = false;
            } else if (bonus.equals("n")) {
                isBonus = false;
                bonusInputConvert = false;
            } else {
                System.out.println("Wrong input. Please try again.");
                bonus = input.next();
            }
        }

        if ( credits >= 50 && !isBonus) {
            c -= 2;
        } else if ( credits < 50 && !isBonus){
            c -= 1;
        } else if (isBonus){
        }

        System.out.println("C = " +c);

    // 4.
        int d = 8;
        int time = 120;
        String out3 = "";

        if ((d % 4 == 0 )&& time < 200) {
            out3 = "check";
        } else if (time >= 200){
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }
        System.out.println(out3);

    }

}
