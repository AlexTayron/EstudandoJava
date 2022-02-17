package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";		
		
		s = s.replace("X", "Bom dia Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		
		System.out.println(s);
		System.out.println("Alex".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Alex");
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}
}
