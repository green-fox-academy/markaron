public class VariableMutation {
    public static void main(String [] args) {
// 1.
        System.out.println("#1:");
        int a = 3;
        a += 10;
        System.out.println(a);

// 2.
        System.out.println("#2:");
        int b = 100;
        b -= 7;
        System.out.println(b);

// 3.
        System.out.println("#3:");
        int c = 44;
        c = c * c;
        System.out.println(c);


// 4.
        System.out.println("#4:");
        int d = 125;
        d /=5;
        System.out.println(d);

// 5.
        System.out.println("#5:");
        int e = 8;
        e = e * e * e;
        System.out.println(e);

// 6.
        System.out.println("#6:");
        int f1 = 123;
        int f2 = 345;
        if (f1 > f2){
            System.out.println(f1>f2);
        } else {
            System.out.println(f1>f2);
        }

// 7.
        System.out.println("#7:");
        int g1 = 350;
        int g2 = 200;
        if(g2*g2 > g1){
            System.out.println(g2*g2 > g1);
        } else {
            System.out.println(g2*g2 > g1);
        }

// 8.
        System.out.println("#8:");
        int h = 135798745;
        int hDivisor = h % 11;
        if (hDivisor == 0){
            System.out.println(hDivisor == 0);
        } else {
            System.out.println(hDivisor == 0);
        }

// 9.
        System.out.println("#9:");
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i1 = 10;
        int i2 = 3;
        int i2Square = i2 * i2;
        int i2Cube = i2Square * i2;
        if(i1 > i2Square && i1 < i2Cube){
            System.out.println(i1 > i2Square && i1 < i2Cube);
        } else{
            System.out.println(i1 > i2Square && i1 < i2Cube);
        }

// 10.
        System.out.println("#10:");
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int j = 1521;
        if (j % 3 == 0){
            System.out.println("Is j dividable by 3? -- ");
            System.out.println(j % 3 == 0);
        } else if (j % 5 == 0) {
            System.out.println("Is j dividable by 5? -- ");
            System.out.println(j % 5 == 0);
        }

// 11.
        System.out.println("#11:");
        //fill the k variable with its content 4 times
        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);
    }
}
