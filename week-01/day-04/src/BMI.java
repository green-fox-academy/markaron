public class BMI {
    public static void main(String[] args){
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI;

        BMI = massInKg / (heightInM * heightInM) ;

        System.out.println("Your BMI is: " + BMI);


    }
}
