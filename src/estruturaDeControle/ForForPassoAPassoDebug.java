package estruturaDeControle;

public class ForForPassoAPassoDebug {
	public static void main(String[] args) {
		int i;
		for( i = 0; i < 10 ; i++) {
			for(int j = 0; j <= 10 ; j++) {
				System.out.printf("[%d %d]", i,j);
			}
			System.out.println();
		}
	}

}
