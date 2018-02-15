public class VariableMutation {
    public static void main(String [] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c = c * c;
        System.out.println(c);

        int d = 125;
        d /=5;
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f1isBigger;
        if (f1 > f2){
            f1isBigger = true;
            System.out.println(f1isBigger);
        } else {
            f1isBigger = false;
            System.out.println(f1isBigger);
        }

        int g1 = 350;
        int g2 = 200;
        boolean g2isBigger;
        if(g2*g2 > g1){
            g2isBigger = true;
            System.out.println(g2isBigger);
        } else {
            g2isBigger = false;
            System.out.println(g2isBigger);
        }

        int h = 135798745;
        boolean hDivBool = false;
        int hDivisor = h % 11;
        if (hDivisor == 0 ){
            hDivBool = true;
            System.out.println(hDivBool);
        }

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i1 = 10;
        int i2 = 3;
        int i2Square = i2 * i2;
        int i2Cube = i2Square * i2;
        boolean i2Bool = false;
        if(i1 > i2Square && i1 < i2Cube){
            i2Bool = true;
            System.out.println(i2Bool);
        }

        // tell if j is dividable by 3 or 5 (print as a boolean)
        int j = 1521;
        boolean jDivide3 = false;
        boolean jDivide5 = false;
        if (j % 3 == 0){
            jDivide3 = true;
            System.out.println("Is j dividable by 3? -- " + jDivide3);
        } else if (j % 5 == 0) {
            jDivide5 = true;
            System.out.println("Is j dividable by 5? -- " + jDivide5);
        }

        //fill the k variable with its cotnent 4 times
        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);

    }
}
