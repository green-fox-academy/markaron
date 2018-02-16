import java.util.Scanner;

public class DEMO01{

        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

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
        }
        }
