package fundamentos;

import java.util.Scanner;

public class DesafioCapitulo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite um numero: ");
		float num1 = entrada.nextFloat();

		System.out.printf("Digite um numero: ");
		float num2 = entrada.nextFloat();

		System.out.printf("Digite um operador:(+,-,*,/)  ");
		String operador = entrada.next();

		// logica
		double resultado = "+".equals(operador) ? num1 + num2 : 0; // resultado vai receber da seguinte forma, se
																	// operador que estiver
																	// entre as aspas for igual ao que esta dentro da variavel do
																	// equals(),'?' pega os numeros e faz o calculo de
																	// acordo com o operador, depois do ':' se ele não
																	// for igual ele poe valor 0 na variavel.
		resultado = "-".equals(operador) ? num1 - num2 : resultado;// nessa linha ele verifica o operador se ele não
																	// for igual ao da aspas ele mantem o valor do
																	// resultado, caso contrario ele faz o calculo
																	// referente .
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		entrada.close();
	}

}
