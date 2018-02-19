public class Factorio {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(factorio(num));
    }

    public static int factorio (int numIn){
        int numOut = 1;
        for (int i = 1; i <= numIn; i++) {
            numOut *= i;
        }
        return  numOut;
    }
}
