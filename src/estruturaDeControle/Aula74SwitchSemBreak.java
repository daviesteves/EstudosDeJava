package estruturaDeControle;

import java.util.Scanner;

import com.sun.java.util.jar.pack.Instruction.Switch;

public class Aula74SwitchSemBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite a cor da faixa: ");
			String faixa =  entrada.next();
		
		switch(faixa.toLowerCase()){
		case "preta":
			System.out.println("Sei o Bassai - Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		case "branca": 	
			System.out.println("Sou um pequeno Gafanhoto");
		}entrada.close();
	}

}
