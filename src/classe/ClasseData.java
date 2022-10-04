package classe;

public class ClasseData {
	int dia;
	String mes; 
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%s/%d",dia,mes,ano);
	
	}
	//ou modo estranho
	void imprimirDataFormatada() { //coloca void pq não vai ter retorno , só imprimir na tela
		System.out.printf("%d/%s/%d",dia,mes,ano);
	
	}
	//utilizando um método dentro do outro, atenção este método só funciona em terminal, não funciona em mais nenhum lugar.
	void imprimirDataFormatada() { //coloca void pq não vai ter retorno , só imprimir na tela , como é o mesmo método (mesma quantidade de palavras) ele da erro de duplicado.
		System.out.println(obterDataFormatada());
	
	}
}
