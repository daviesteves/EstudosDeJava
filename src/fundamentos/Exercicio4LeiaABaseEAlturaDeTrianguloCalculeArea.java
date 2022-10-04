package fundamentos;

import java.util.Scanner;

public class Exercicio4LeiaABaseEAlturaDeTrianguloCalculeArea {
	public static void main(String[] args) {
		//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("digite a base do triangulo: ");
		float base = entrada.nextFloat();
		System.out.printf("digite a altura do triangulo: ");
		float altura = entrada.nextFloat();
		float area = (base * altura)/2;
		
		System.out.printf("A area do triangulo é :%f" ,area);
		entrada.close();
	}

}
