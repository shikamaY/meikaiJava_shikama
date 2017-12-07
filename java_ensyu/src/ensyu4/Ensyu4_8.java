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
		int count = 1;
		// 終了するまでループする
		while (true) {
			// inputnumが10未満の場合
			if ( inputNum < 10){
				// countを0にする
				count = 1;
				// ループを終了する
				break;
			}
			// inputNumを10で割った結果が10未満か判定
			if ((inputNum /= 10) < 10) {
				// countをインクリメント
				count++;
				// ループを終了する
				break;
			}
			// countをインクリメント
			count++;
		}
		// 桁数を表示する
		System.out.println("その値は" + count + "桁です。");
	}

}
