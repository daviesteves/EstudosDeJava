package estruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	private int tentativas = 10;

	// Construtor da classe
	public Adivinhacao() {

		// Para indicar se acertou o numero ou não
		boolean acertou = false;

		int numeroAleatorio = getNumeroAleatorio();

		System.out.printf("Tente adivinhar um número de 0 a 100, você tem 10 tentativas ! \n");

		// Esse for, fará um loop na quantidade de tentativas
		for (int i = 0; i <= tentativas; i++) {

			System.out.printf("\n Você tem " + (tentativas - i) + " tentativas...");
			System.out.printf("\n Digite um número : ");

			// Obtendo o que foi digitado e convertento ele pra Integer (numero)
			Scanner scan = new Scanner(System.in);

			Integer numeroDigitado = Integer.valueOf(scan.nextLine());

			// Verificando se o numero digitado é igual ao numero aleatorio
			if (numeroDigitado.equals(numeroAleatorio)) {

				// Exiba uma mensagem dizendo que o numero digitado é o correto
				System.out.printf("\n Número correto !");

				// Indica que acertou o numero
				acertou = true;

				// Esse break interrompe o loop (for na linha 17)
				// Interrompe porque o numero já foi encontrado
				break;

			} else if (numeroDigitado < numeroAleatorio) {

				System.out.printf("\n O número digitado é MENOR que o número aleatório, digite um número maior!");

			} else {
				System.out.printf("\n O número digitado é MAIOR que o número aleatório, digite um número menor!");
			}

		}

		if (acertou == false) {
			System.out.printf("\n\n Você não conseguiu adivinhar o número. O número aleatório era: " + numeroAleatorio);
		}
		
		
		System.out.printf("\n Fim da execução...1");

	}

	// método que gera um numero aleatorio de 0 a 100
	private int getNumeroAleatorio() {

		// Classe do java que gera números aleatórios
		Random gerador = new Random();

		// Definindo um range de 100 para que o gerador escolha entre 0 e 100
		int numeroAleatorio = gerador.nextInt(100);

		// Retornando o numero gerado
		return numeroAleatorio;
	}

	public static void main(String[] args) {

		// Executa a classe
		new Adivinhacao();

	}

}
