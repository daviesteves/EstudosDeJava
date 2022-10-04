package fundamentos;

import java.util.Scanner;

public class Exercicio3LeiaValorMostreQuadradoECubo {
	public static void main(String[] args) {
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		Scanner entrada = new Scanner(System.in);
		System.out.printf("digite um numero: ");
		double num = entrada.nextDouble();
		double quadrado = num*num;
		double cubo = num*num*num;
		System.out.printf("O numero %.2f ao quadrado é %.2f , ao cubo é %.2f",num,quadrado,cubo);
		
		
		
		
		
		
		entrada.close();
	}

}
