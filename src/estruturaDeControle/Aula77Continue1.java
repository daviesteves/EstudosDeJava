package estruturaDeControle;

public class Aula77Continue1 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;// se o resultado for igual a 1 escreva 
//na tela o valor de i, se n�o continue a contar
				//break; 
			}
				
			System.out.println(i);
			
		}
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;{
//aqui a repeti��o vai continuar apos o valor 5, 
//n�o imprimindo ele				
				System.out.println(i);
				
			}
			
		}
	}

}
