package fundamentos;

public class Nota��oPonto {
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
		
		//Tipos primitivos n�o tem o operador"."
		int a = 3;
		System.out.println(a);
		
	}
}
