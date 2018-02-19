public class SumAll {
    public static void main(String[] args) {
        int [] ai = {3,4,5,6,7};
        sum(ai);
    }

    public static void sum(int[] value){
        int ai = 0;
        for (int i = 0; i < value.length; i++){
            ai = ai + value[i];
        }
        System.out.println(ai);
    }

}

