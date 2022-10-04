package estruturaDeControle;

import java.util.Scanner;

public class DesafioSemanaIfElseComparandoString {
	public static void main(String[] args) {
		// usuario digita o dia da semana e o programa escreve um numero relacionado

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da Semana: ");

		String dia = entrada.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} // if("domingo".equalsIgnoreCase(dia))
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) { // usando a expressão logica ||(ou)
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido");
		}
		entrada.close();
	}

}
