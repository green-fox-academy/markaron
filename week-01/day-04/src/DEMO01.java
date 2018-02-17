import java.util.Scanner;

public class DEMO01{

        public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                int c = 123;                                // declarations
                boolean isBonus = false;
                boolean bonusInputConvert = true;

                System.out.println("How much are the credits?");    //first question
                int credits = input.nextInt();

                System.out.println("Is this a bonus? y / n");       //second question
                String bonus = input.next();

                while(bonusInputConvert) {                          // while loop for typo
                    if (bonus.equals("y")) {                        // .equals() insted of ==
                        isBonus = true;
                        bonusInputConvert = false;
                    } else if (bonus.equals("n")) {
                        isBonus = false;
                        bonusInputConvert = false;
                    } else {
                        System.out.println("Wrong input. Please try again.");      // if there is a typo it runs again
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
