public class CodingHours {
    public static void main(String[]args){
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float attendeeHour = 6f;
        float weekNum = 17f;
        weekNum = weekNum * 5 * attendeeHour;
        System.out.println(weekNum + " hours is spent by coding by an attendee. ");

        System.out.println(weekNum * 100 / 884 + "% is the average coding during a semester.");
    }
}
