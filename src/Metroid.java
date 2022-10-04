
public class Metroid {
	public static void main(String[] args) {
		double distancia=149600000;
		double velocidade = 28440;
		double horasViagem = distancia/velocidade;
		double diasViagem = horasViagem/24;
		System.out.printf("Para chegar ao planeta Zebes, Samus ira levar %.2f dias",diasViagem);
	}

}
