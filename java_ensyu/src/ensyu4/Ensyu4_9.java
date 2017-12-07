package ensyu4;

import java.util.Scanner;

/*演習4-9
 * 正の整数値ｎを読み込んで、１からnまでの積を求めるプログラムを作成せよ
 */

public class Ensyu4_9 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.println("nの値:");
		int inputNum = stdIn.nextInt();

		// 積の結果を入れる変数を用意する
		int result = 1;
		// 0以下の場合は正数を入力するように表示する
		if (inputNum <= 0) {
			System.out.println("正数を入力してください");
		} else {
			// inputNum回分ループする
			for (int c = 1; c <= inputNum; c++ ) {
				result *= c;
			}
			// 結果を表示する
			System.out.println("1から" + inputNum + "までの積は" + result + "です。");
		}
	}

}
