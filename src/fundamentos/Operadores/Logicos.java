package fundamentos.Operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("--");
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || !condicao2);
		System.out.println(condicao1 ^condicao2);
		System.out.println(!!condicao1);
		System.out.println(!!condicao2);
		
		//Operadores Binarios
		
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela verdade Ou(OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela verdade OU Exclusivo(XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// Operadores Onarios
		
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true); 
		System.out.println(!false);
	}

}
