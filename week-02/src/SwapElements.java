public class SwapElements {
    public static void main(String[] args) {
        String [] abc = {"first","second","third"};
        String temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;

        System.out.println("0:" + abc[0]);
        System.out.println("2:" + abc[2]);
    }
}
