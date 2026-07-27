package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {

		int sumNumber = sumNumbers(6, 2);
		sumResult(sumNumber);

		int subtractNumber = subtractNumbers(6, 2);
		sumResult(subtractNumber);

		int multiply = multiplys(6, 2);
		sumResult(multiply);

		int divide = divides(6, 2);
		sumResult(divide);
	}

	public static int sumNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtractNumbers(int a, int b) {
		int sum = a - b;
		return sum;
	}

	public static int multiplys(int a, int b) {
		int sum = a * b;
		return sum;
	}

	public static int divides(int a, int b) {
		int sum = a / b;
		return sum;
	}

	public static void sumResult(int sum) {
		System.out.println("計算結果は" + sum + "です。");
	}
}