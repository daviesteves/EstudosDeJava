package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // convers�o de um tipo inteiro(1) para double, convers�o implicita (n�o haver�
						// perda pois o double � maior que 1)
		double ab = 1.1234567888888; // o double suporta este numero
		System.out.println(a);
		System.out.println(ab);

		float b = 1.12F;
		float ba = (float) 1.1234567888888; // convers�o explicita(CAST), ele vai cortar os dados sem fazer
											// aproxima��es, ou seja se perde os dados .
		System.out.println(b);
		System.out.println(ba);

		int c = 128;// note que ele gerou um numero diferente no console, pois ele n�o suporta esse
					// numero, � come�a a voltar para numeros negativos
		// byte d = c; nesse caso ele vai dar erro
		byte d = (byte) c;// neste vc esta for�ando ele a fazer a convers�o
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);// por ter convertido de double para int, o java esquece dos numero depois da
								// virgula.
	}

}
