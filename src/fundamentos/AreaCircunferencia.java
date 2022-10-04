package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		int raio=3;
		double Raio=3.4;
		final double PI=3.14159;
		double area=(PI*Raio*Raio);
		
		System.out.println(PI*Raio*Raio);
		System.out.println(area);
		
		Raio =10;
		area=PI*Raio*Raio;
		System.out.println("Area = "+ area+"m2");
	}
}
