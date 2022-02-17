package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("BOA"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("dia"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("Boa tarde"));

        var nome = "Alex";
        var sobrenome = "Tayron";
        var idade = 33;
        var salario = 18576.36;

        System.out.println("Nome: " + nome + "\nsobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario" + salario);
        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        System.out.println(frase);

        String maisUmaFrase = ("Nome: " + nome + "\nsobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario"
                + salario);
        System.out.println(maisUmaFrase);
    }

}
