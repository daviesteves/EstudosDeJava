package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: $d %d %d %d %d %n",1 ,2,
				3,4,5);
		System.out.printf("salario: %.1f%n",1234.5678);//%n pula linha
		System.out.printf("Nome: %s%n","João");
		
		Scanner entrada = new Scanner(System.in);// aguarda entrada do teclado
		
		System.out.printf("Digite o seu nome: ");// tem que usar o printf pra receber os dados
		String nome = entrada.nextLine();// declara a variavel string e espera a digitação do caracter
		
		System.out.printf("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Digite a sua idade: ");
		int idade = entrada.nextInt();//declara a variavel inteira e aguarda a entrada de um numero inteiro
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();// finaliza a entrada
		
		
		
	}
}
