package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		final double AJUSTE=32, FATOR=5/9.0;
		double farah=180;
		double celsius=(farah-AJUSTE)*FATOR;
		
		
		System.out.println("temperatura convertida em "+celsius+"ºC");
		
		
		
	}
}
