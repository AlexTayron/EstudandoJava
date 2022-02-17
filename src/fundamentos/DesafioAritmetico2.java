package fundamentos;

public class DesafioAritmetico2 {
    public static void main(String[] args) {
    /**
    *   int b = (int )Math.pow(a, 3);
        double c = Math.pow(a, 3);
    */
        double a = 6 * ( 3+2);
        double b = (1 - 5)*(2 - 7);
        int c = 3 * 2;
        int d = 2;
        int e = 10;

        double a1 = Math.pow(a, 2);
        int e1 = (int)Math.pow(e, 3);
        
        int eq1 = (int)(a1 / c);
        int eq2 = (int)(b / d);

        int b1 =(int) Math.pow(eq2, 2);

        int f1 = (int)(eq1 - b1);
        int f2 = (int)Math.pow(f1, 3);

        System.out.println(f2 / e1);

    }
}
