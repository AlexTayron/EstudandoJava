package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String sl1 = entrada.next().replace(",", ".");
        double s1 = Double.parseDouble(sl1);

        System.out.print("Digite o segundo salario: ");
        String sl2 = entrada.next().replace(",", ".");
        double s2 = Double.parseDouble(sl2);

        System.out.print("Digite o terceiro salario: ");
        String sl3 = entrada.next().replace(",", ".");
        double s3 = Double.parseDouble(sl3);

        double soma = (s1 + s2 + s3);
        double media = (soma / 2);

        System.out.println(
            "A soma dos salarios é R$" + soma + " e a media é R$" +media
        );
        
        entrada.close();
    }
}
