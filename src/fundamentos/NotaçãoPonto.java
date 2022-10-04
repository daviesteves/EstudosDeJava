package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s ="bom dia X";
		s = s.replace("X", "Senhora");	//troca a string X por senhora 
		s = s.toUpperCase();	//transforma a string em maiuscula
		s = s.concat("!!!");	//adiciona estes caracteres ao testo da string
		
		System.out.println(s);
		
		System.out.println("leo".toUpperCase());
		
		String y = "bom dia X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador"."
		int a = 3;
		System.out.println(a);
		
	}
}
