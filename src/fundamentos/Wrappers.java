package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        
        //byte
        Byte b = 100;
        Short s = 1000;
        //Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        // converte o boolean para string
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString());
        System.out.println(c + "...");

        Float f = 123.05F;
        System.out.println(f);

        Double d = 123456.456123;
        System.out.println(d);


    }
    
}
