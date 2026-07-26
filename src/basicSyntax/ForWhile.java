package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(num);
			}
		}
		//num=15の時はFizzBuzzなのに出力は上書きはされないから
		//else if(num % 3 == 0 && num % 5 == 0) {
		//System.out.println("FizzBuzz");
		//これを先に持ってこないといけない

		String[] gengos = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };
		for (String gengo : gengos) {
			if (gengo.equals("Java")) {
				System.out.println("現在学習中の言語は" + gengo + "です。");
				continue;
			} else if (gengo.equals("HTML")) {
				System.out.println(gengo + "はプログラミング言語ではありません。");
				break;
			} else {
				System.out.println(gengo);
			}
		}
		//		文字列（String）を比較するときは、とりあえず.equals()を使う
	}
}
