package estruturaDeControle;
import java.util.Scanner;

public class Ex8LetrasSeparadas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();//converte a palavra em um vetor posição por posição de
		//acordo com as letras, colocando cada uma em uma posição.
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
			
		}
		
		entrada.close();
	}

}
