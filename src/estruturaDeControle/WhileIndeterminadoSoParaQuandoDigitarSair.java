package estruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminadoSoParaQuandoDigitarSair {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String saida= "";
		
		while(!saida.equalsIgnoreCase("sair")) {
			System.out.print("digite a palavra magica e pare o programa: ");
			saida= entrada.nextLine();
		}
		
		System.out.println("Acerto miseravel");
		entrada.close();
	}

}
