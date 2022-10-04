package estruturaDeControle;

import java.util.Scanner;


public class Ex2AnoBiSexto {
	public static void main(String[] args) {
		int dias;
		int bisexto;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		dias = entrada.nextInt();
		bisexto = dias % 4;
		if (bisexto == 0) {
			System.out.println("Este ano é Bisexto");
		}else {
			System.out.println("Este ano é não é Bisexto");
		}
		 entrada.close();
	}

}
