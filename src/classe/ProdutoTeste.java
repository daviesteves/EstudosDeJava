package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		//aqui testaremos o produto atraves do metodo main
		//como estou dentro do mesmo pacote  eu não preciso importar nada da outra classe
		
		Produto p1 = new Produto(); // aqui estou falando que o objeto\instancia p1 sera criado pelo construtor (new) usando a estrutura de Produto, por isso a notação ponto apresenta as opções.
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();//coclocando mais um metodo dentro do parentes , tem que por um valor 
		double precoFinal2 = p2.precoComDesconto(0.5);
		
		System.out.println((precoFinal1 + precoFinal2) / 2);
		
		System.out.println();
	}

}
