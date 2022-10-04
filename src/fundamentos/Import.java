package fundamentos;

import java.util.Date; //ctrl+shift+o= chama o import para ser usado

import javax.swing.JButton;

public class Import {
	public static void main(String[] args) {
		String s = "bom dia";
		System.out.println(s);
		
		Date d = new Date(); //colocar o cursor sobre date e escolher o import
		System.out.println(d);
		
		JButton botao = new JButton(); //ctrl+espaço= já adiciona o import se ele estiver na classe padrão
			
	}

}
