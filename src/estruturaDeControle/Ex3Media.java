package estruturaDeControle;

import java.util.Scanner;

public class Ex3Media {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		media = (nota1 + nota2) / 2;
		if (media >= 7) {

			System.out.println("Aprovado!");

		} else if ( media >= 4) {

			System.out.println("Recuperação");

		} else {
			System.out.println("reprovado");
			entrada.close();
		}
	}

}
