package fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//saudavel tomou sorvete or
		//tv 32" xor
		//50" and
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 =trabalho1 && trabalho2;
		boolean comprouTv32 =trabalho1 ^ trabalho2; 
		boolean tomouSorvete = trabalho1 || trabalho2;
		System.out.println("Comprou Tv 50\"?" + comprouTv50 );
		
		System.out.println("comprou tv 32?" + comprouTv32);
		
		System.out.println("Tomou sorvete\"?" +tomouSorvete);
		System.out.println("ficou mais saudavel?" + !tomouSorvete);
	}

}
