package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner digite = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro salario: ");
		String salario1 = digite.nextLine().replace(",", ".");// o comando replace troca a ',' por '.'
		
		System.out.printf("Digite o segundo salario: ");
		String salario2 = digite.nextLine().replace(",", ".");
		
		System.out.printf("Digite o terceiro salario: ");
		String salario3 = digite.nextLine().replace(",", ".");
		
		
		float sal2 = Float.parseFloat(salario2);
		float sal3 = Float.parseFloat(salario3);
		
		float soma= (sal1+sal2+sal3)/3;
		
		System.out.println("\nA média do seu salario é " + soma);
		digite.close();
	}

}
