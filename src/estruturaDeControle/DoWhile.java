package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "" ;
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));//coloca o simbolo de barrado pois ele s� para de executar quando vem a negativa nesse caso
		System.out.println("vai simbora fio de uma rapariga");
		entrada.close();
	}

}
