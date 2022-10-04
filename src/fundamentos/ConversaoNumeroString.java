package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());// transformando tipo numérico em string

		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());// transformando um primitivo em string, pode usar os outros
															// tipos : Float ...

		System.out.println(("" + num1).length());// forma não usual
		System.out.println(("" + num2).length());
	}
}
