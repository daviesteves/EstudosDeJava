package estruturaDeControle;

public class NumerosPrimos {
	public static void main(String[] args) {
		int result[];
		int j;
		int i;
		System.out.println("olá");
		for ( j = 2; j < 121; j++) {
			
			
			for ( i = 2; i < 120; i++) {
				result[j]= j*i;
				
				
				
			}//fim do for i
		}//fim do for j	
		
		for(int col=0;col<121;col++) {
		System.out.print("%d",result[col]);
		}	
		
		
	}

}
