package estruturaDeControle;

import javax.swing.JOptionPane;

public class IfElseConverterStringParaNumero {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o numero: ");//cria caixa para entrada de um numero string
		int numero = Integer.parseInt(valor);//converte esta string para numero
		
		if(numero % 2 == 0) {//se o resto da divisão por 2 for 0, escreva Numero par
			System.out.println("Numero Par");
		}
		else {
			System.out.println("Numero impar");
		}
	}

}
