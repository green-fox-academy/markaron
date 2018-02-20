import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(List<String> girls, List<String> boys){
        ArrayList<String> twoGender = new ArrayList<>();

        for (int i = 0; i < girls.size() ; i++) {
            twoGender.add(girls.get(i));
            twoGender.add(boys.get(i));
        }
        twoGender.add(boys.get(girls.size()));
        return twoGender;
    }
}
