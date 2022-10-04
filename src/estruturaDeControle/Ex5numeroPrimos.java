package estruturaDeControle;

import java.util.Scanner;

public class Ex5numeroPrimos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i;
		int contadorDeDivisores =0;

		System.out.print("digite um numero pra verificar se ele � primo: ");
		int numero = entrada.nextInt();
		for (i = 2; i < 120; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}

		}

	
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + numero + "� um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "n�o � um numero primo.");
		}

		entrada.close();
	}

}
