package classe;

public class Produto {
	//criamos um tipo aqui
	
	String nome;//atributo
	double preco; //atributo
	double desconto; //atributo
	double precoComDesconto(double descDoGerente) { // criando um método, dentro do parenteses eu posso colocar um desconto , nete caso
		return preco* (1-desconto +descDoGerente);
		
	}
	double precoComDesconto() { // criando um método sem deconto, note que ele possue o mesmo nome, mas como a estrutura é diferente é possivel a utilização
		return preco* (1-desconto);
		
	}
}
