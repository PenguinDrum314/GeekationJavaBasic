package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 8;
		int b = 6;
		
		boolean ab = (a > b);
		System.out.println(ab);
		
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean tenki = (isSunny && isWarm);
		System.out.println(tenki);
		
		int x = 1;
		int y = 4;
		
		boolean xy = (x >= 0 && y % 2 == 0);
		System.out.println(xy);
		
		boolean hasPermission = false;
		
		boolean notFalse = !(hasPermission); 
		System.out.println(notFalse);

	}

}
