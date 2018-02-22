import java.util.ArrayList;
import java.util.Arrays;
// Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
// The output should be: "Noooooo"
// Do this again with a different solution using different list methods!

public class ElementFider {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8));

       containsSeven(arrayList);
        isSevenAlive(arrayList);
    }

    public static void containsSeven(ArrayList<Integer> input){
        if (input.contains(7)){
            System.out.println("Hoorray");
        } else {
            System.out.println("Nooooooooooo");
        }
    }

    public static void isSevenAlive (ArrayList<Integer> input){
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == 7){
                System.out.println("Hoorray");
            }else {
                System.out.println("NOOOOO NOOOO");
            }
        }
    }
}
