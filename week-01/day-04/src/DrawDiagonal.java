import java.util.Scanner;
public class DrawDiagonal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How big is the square:");
        int s = input.nextInt();

        for(int i=1;i<=s;i++){
            for(int j=1;j<=s;j++){
                if(i>1 && i<s && j>1 && j<s){
                    if(i==j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
