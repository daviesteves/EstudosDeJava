package estruturaDeControle;

import java.util.Scanner;

public class Ex7SomaNumNegativos {
	public static void main(String[] args) {
		int num1=0;
		int referencia=0;
		int soma=0;
		Scanner entrada = new Scanner(System.in);
		
		
		 while (num1>=referencia) {
			System.out.print("Digite um numero para somar(para sair digite um negativo):" );
			num1=entrada.nextInt();
			if (num1>referencia) {
				
				soma +=num1;
				System.out.println("Total: "+ soma);
			}
		}
		System.out.println("saiu");	
		
		entrada.close();
		
	}

}
