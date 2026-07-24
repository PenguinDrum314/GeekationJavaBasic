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
//		for (String gengo : gengos) {
//			switch (gengo) {
//			case "Java":
//				System.out.println("現在学習中の言語は" + gengo + "です。");
//				break;
//			case "HTML":
//				System.out.println(gengo + "はプログラミング言語ではありません。");
//				break;
//			default:
//				System.out.println(gengo);
//				break;
//			}
//		}
	}
}

//num=15の時はFizzBuzzなのに出力は上書きはされないから
//else if(num % 3 == 0 && num % 5 == 0) {
//                    System.out.println("FizzBuzz");
//これを先に持ってこないといけない
