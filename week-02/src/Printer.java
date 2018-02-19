public class Printer {
    public static void main(String[] args) {
        String [] wordsToPrint = {"first", "Second","Third","Fourth"};
        printer(wordsToPrint);
    }

    public static void printer(String...words){
        for(String any : words ) {
            System.out.println(any);
        }

    }

}
