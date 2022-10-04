package estruturaDeControle;

import java.util.Scanner;

public class Ex1VerificaUmNumSePar {
	public static void main(String[] args) {
		int par;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();

		if (numero <= 10 && numero >= 0) {
			if (numero % 2 == 0) {
				System.out.println("par");

			} else {
				System.out.println("impar");
			}

		}
		entrada.close();
	}

}
