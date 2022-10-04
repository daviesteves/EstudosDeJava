package fundamentos;

import java.util.Scanner;

public class Exercicio1ConverteDeCelsiusParaFahrenheit {
	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite uma temperatura em celsius: ");
			double tempCel = entrada.nextDouble();
			double tempF = (tempCel*1.8)+32;
			System.out.println(tempF);
		
		entrada.close();
		
	}

}
