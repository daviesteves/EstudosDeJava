package fundamentos;

import java.util.Scanner;

public class IgualdadeString {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".contentEquals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // o next elimina espa�os em branco digitados .
		System.out.println("2" == s2.trim());//o trim elimina espa�os em branco digitados .
		System.out.println("2".contentEquals(s2));
		
		entrada.close();
	}

}
