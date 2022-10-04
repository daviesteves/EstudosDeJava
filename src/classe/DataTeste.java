package classe;

public class DataTeste {
	public static void main(String[] args) {
		ClasseData d1 = new ClasseData();
		d1.dia = 01;
		d1.mes = "fevereiro";
		d1.ano =2020;
		
		var d2 = new ClasseData();
		d2.dia = 03;
		d2.mes = "julho";
		d2.ano = 2019;
		System.out.println(d1.obterDataFormatada());
		d2.imprimirDataFormatada();// adiciona direto pra imprimir
	}
	
}
