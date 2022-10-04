package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // conversão de um tipo inteiro(1) para double, conversão implicita (não haverá
						// perda pois o double é maior que 1)
		double ab = 1.1234567888888; // o double suporta este numero
		System.out.println(a);
		System.out.println(ab);

		float b = 1.12F;
		float ba = (float) 1.1234567888888; // conversão explicita(CAST), ele vai cortar os dados sem fazer
											// aproximações, ou seja se perde os dados .
		System.out.println(b);
		System.out.println(ba);

		int c = 128;// note que ele gerou um numero diferente no console, pois ele não suporta esse
					// numero, é começa a voltar para numeros negativos
		// byte d = c; nesse caso ele vai dar erro
		byte d = (byte) c;// neste vc esta forçando ele a fazer a conversão
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);// por ter convertido de double para int, o java esquece dos numero depois da
								// virgula.
	}

}
