public class SumAll {
    public static void main(String[] args) {
        int [] ai = {3,4,5,6,7};
        sum(ai);
    }

    public static void sum(int[] value){
        int sum = 0;
        for (int i = 0; i < value.length; i++){
            sum = sum + value[i];
        }
        System.out.println(sum);
    }

}

