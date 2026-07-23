package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		int num = 2;		
		if (num % 2 == 0) {
			System.out.println("2の倍数です");
		}
		
		num = 3;		
		if (num % 3 == 0) {
			System.out.println("3の倍数です");
		} 
		
		num = 7;
		if (num % 2 == 0) {
			System.out.println("2の倍数です");
		} else if (num % 3 == 0) {
			System.out.println("3の倍数です");
		} else {
			System.out.println("どちらでもありません");
		}
		
		String perf = "北海";
		switch (perf) {
		case ("北海"):
			System.out.println("北海道");
		break;
		}
		
		perf = "東京";
		switch (perf) {
		case ("東京"):
			System.out.println("東京都");
		break;
		}
		
		perf = "京都";
		switch (perf) {
		case ("京都"):
			System.out.println("京都府");
		break;
		}
		
		perf = "沖縄";
		switch (perf) {
		case ("北海"):
			System.out.println("北海道");
		break;
		case ("東京"):
			System.out.println("東京都");
		break;
		case ("京都"):
			System.out.println("京都府");
		break;
		default:
			System.out.println("当てはまりません");
			break;
		}

	}

}
