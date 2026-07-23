package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = x + y;
		
		System.out.println("変数zの値は" + z + "です");
		
		double a = 5.25;
		a += 2.5;
		a *= 3.0;
		
		System.out.println("変数aの値は" + a + "です");
		
		int b = (int) a;
		System.out.println("変数bの値は" + (b + 10) + "です");

	}

}
