package estruturaDeControle;

import java.util.Scanner;

public class Aula57IfUsandoBoolean {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >=7 && media <= 10) { //se for s� uma linha pra executar ap� , n�o precisa abrir chave
			System.out.println("Aprovado!!");
			System.out.println("Parabens");
		}
		if(media <7 && media >=4.5) {
			System.out.println("Recupera��o");
		}
		boolean criterioReprovacao = media <4.5 && media >=0;
		if(criterioReprovacao) {
			System.out.println("Reprovado!!!");
		}
		
		entrada.close();
	}

}
