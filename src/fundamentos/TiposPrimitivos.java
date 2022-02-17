package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		
		//long pontosAcumulados = 3_234_845_223L; //Devo colocar a letra "L" , para que a variavel seja conhecida.
		long pontosAcumulados = 1_234_845_223;
		
		
		//Tipos numericos reais
		float salario = 11_445.44F; // "F" para declara float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipoa booleano
		boolean estaDeFerias = false; //true
		
		// Tipo Caractere
		char status = 'A'; //Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
	}

}
