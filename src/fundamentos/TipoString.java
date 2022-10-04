package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); // imprime a posição 2 da string:á

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));// adiciona os caracteres "!!!" a string
		System.out.println(s + "!!!");// outra forma de adicionar caracteres
		System.out.println(s.startsWith("a"));// verifica se a string começa com esse valor
		System.out.println(s.toUpperCase());// converte tudo que estiver na string para maisculo
		System.out.println(s.toLowerCase());// converte tudo que estiver na string para minudculo
		System.out.println(s.toUpperCase().endsWith("TARDE"));// verifica se a string termina igual ao valor descrito(o
																// comando toUpper , transforma tudo em maiusculo antes)
		System.out.println(s.toLowerCase().startsWith("boa"));// verifica se a string começa igual ao valor descrito(o
																// comando toLower , transforma tudo em minusculo antes)
		System.out.println(s.length());// verifica o tamanho da string , inclusive espaço
		System.out.println(s.toLowerCase().equals("boa tarde"));// verifica se o texto esta na string, exatamente como
																// descrito
		System.out.println(s.equalsIgnoreCase("BoA tArDe"));// verifica se o texto esta na string, independente de
															// maiusc\minusc

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.println(
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade + "\nSalario: " + salario + "\n\n"); // formas
																														// de
																														// escrever
																														// usando
																														// o
																														// concatenar

		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f .", nome, sobrenome, idade, salario);// escrevendo
																											// sem
																											// concatenar

	}
}
