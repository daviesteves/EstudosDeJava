package estruturaDeControle;

import java.util.Scanner;

public class Ex4NumeroPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int resultado = 0;
		
		System.out.print("Digite um numero: ");
		
		numero = entrada.nextInt();
		
		for(int i = 2;i <numero ; numero ++) {
			
		}
		if(resultado == 0) {
			System.out.println("o numero não é Primo");
		}else {
			System.out.println("O numero é Primo");
		}
		
		
		entrada.close();
	}

}
