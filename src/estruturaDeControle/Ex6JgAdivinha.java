package estruturaDeControle;

import java.util.Scanner;

public class Ex6JgAdivinha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int NumSecre = 65;
		int valor;
		int contador = 10;
		int sairTotal;
		do {

			do {
				
				System.out.printf("\nDecubra o numero secreto entre 0 e 100 ,você tem %d chances"
						+ " para descobrir, qual o numero: ",contador);
				valor = entrada.nextInt();
				contador --;
				if (contador==0) {
					System.out.println("suas chances esgotaram");
					valor = NumSecre;
				
				}else if (valor<NumSecre) {
					System.out.printf("o numero secreto é maior que %d " ,valor);
				
				}else if (valor>NumSecre) {
					System.out.printf("o numero secreto é menor que %d " ,valor);
					
				}else {
					System.out.printf("Parabens o %d é o numero secreto" ,valor);
				}
			} while (valor != NumSecre);

			System.out.print("\nDigite 0 para sair: ");
			sairTotal= entrada.nextInt();

		} while (sairTotal != 0);
		System.out.println("That's all folks!!");

		entrada.close();

	}
}
