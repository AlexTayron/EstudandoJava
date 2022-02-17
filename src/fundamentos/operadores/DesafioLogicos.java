package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou  F) 
        // Trabalho na quinta (V ou F)

        boolean ti = false;
        boolean servente = false;

        boolean tv50 = ti && servente;
        boolean tv32 = ti ^ servente;
        boolean tomeiSorvete = ti || servente;

        // Operador Unario
        boolean suadavel = !tomeiSorvete;
        
        System.out.println("Comprei a TV50\"?" + tv50);
        System.out.println("Comprei a TV32\"?" + tv32);
        System.out.println("Tomei Sorvete\"?" + tomeiSorvete);
        System.out.println("Estamos Saudaveis\"?" + suadavel);



    }
}
