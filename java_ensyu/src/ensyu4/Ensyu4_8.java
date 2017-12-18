package ensyu4;

import java.util.Scanner;

/*演習4-8
 * 正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ
 */

public class Ensyu4_8 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.println("整数値:");
		int inputNum = stdIn.nextInt();

		// 桁数を数える変数を用意
		int count = 0;
		// inputNumが10で割り切れて10以下の場合終了
		while (inputNum % 10 != 0 || inputNum >= 10) {
			// inputNumを10で割った割る
			inputNum /= 10;
			// countをインクリメント
			count++;
		}
		// 桁数を表示する
		System.out.println("その値は" + count + "桁です。");
	}

}
