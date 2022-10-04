package fundamentos;

import java.util.Scanner;

public class Exercicio2LeiaEmFahrenheitConvertaCelsius2 {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite uma temperatura em Fahrenheit: ");
			double tempf = entrada.nextDouble();
			double tempCel = (tempf-32)/1.8;
			System.out.printf("%.3f",tempCel);
			
	}

}
