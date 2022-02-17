package fundamentos;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
			
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		
	
		System.out.println(celsius+"°C");
		
	}

}