package ensyu4;

import java.util.Scanner;

public class Ensyu4_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 終了判定の変数を用意する
		int retry;
		// 終了するまでループ
		do {
			System.out.print("整数値:");
			int n = stdIn.nextInt();

			if (n > 0)
				System.out.println("その値は正です。");
			else if (n < 0)
				System.out.println("その値は負です。");
			else
				System.out.println("その値は０です。");
			// 続けるか判定するための入力を促す
			System.out.println("もう一度？ 1・・・Yes/0・・・NO：");
			// retryに値を代入
			retry = stdIn.nextInt();
		// retryが0の場合は終了する
		} while(retry == 0);
	}

}
