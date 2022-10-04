package fundamentos;

public class DesafioOperadorAritmeticos {
	public static void main(String[] args) {
		int a = 6*(3+2), 
				b = (int) Math.pow(a,2),//b = (int) Math.pow((6*(3+2)),2)
				c = (3*2),
				d = b/c , 
				e = ((1-5)*(2-7))/2,
				f = (int) Math.pow(e, 2),//f = (int) Math.pow((((1-5)*(2-7))/2), 2)
				g = d-f,
				h =(int) Math.pow((g), 3), //h =(int) Math.pow(( d-f), 3)
				i =(int) Math.pow(10, 3),
				j= h/i;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}

}
