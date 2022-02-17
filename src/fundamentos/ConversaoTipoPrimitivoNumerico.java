package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; //conversão implicita
        System.out.println(a);

        float b = (float) 1.123456789; //explicita (cast)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explicita (cast)
        System.out.println(d);

        double e = 1;
        int f = (int) e;// explicita (cast)
        System.out.println(f);

        double x = 1.99999;
        int y = (int) x;// explicita (cast)
        System.out.println(y);
    }
}
