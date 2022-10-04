package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0 ;
		int quantidadeDeNotas = 0;
		while(nota != -1) {//enquanto for diferente de -1 
			System.out.print("Qual a nota:  (ou digite -1 p/ sair)");
			 nota = entrada.nextDouble();
			 
			 if(nota <= 10 && nota>=0) {//serve para não adicionar -1 no calculo da media
				 total += nota;
				 quantidadeDeNotas ++;
			 }else  if(nota != -1){
				 System.out.println("nota invalida");
			 }
		
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Media: " +media);
		
		entrada.close();
		
	}

}
