package fundamentos;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia\n");
        System.out.println("Bom");
        System.out.println("dia!!");
        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salario: %.1f %n", 12345.12345);
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\nSeu nome é %s e sua idade é %d anos" ,nome, idade);
   
        entrada.close();
    }
}
