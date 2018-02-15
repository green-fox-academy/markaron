public class SecondsInADay {
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingHours = currentHours * 3600;
        int remainingMinutes = currentMinutes * 60 + remainingHours;

        int passedSecondsToday = currentSeconds + remainingMinutes;
        int remainingSeconds = 86400 - passedSecondsToday;

        System.out.println(remainingSeconds);
    }
}