package ensyu7;

import java.util.Scanner;

/* ｢正の整数値：｣と表示してキーボードから正の整数値を読み込んで、
 * その値を返却するメソッドreadPlusIntを作成せよ。
 * 0や負の値が入力されたら再入力させること
 */

public class Ensyu7_9 {

	public static void main(String[] args) {
		// ユーザに正の整数を入力させるメソッドを実行する
		readPlusInt();
	}

	/* ユーザに正の整数を入力させるメソッド
	 * 正の整数以外が入力された場合は再入力させる
	 */
	static int readPlusInt() {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);
		// ユーザからの入力値を入れる変数
		int intNumber;
		// 入力値が1未満の場合はループする
		do {
			// ユーザに正の整数値を入力してもらうために表示する
			System.out.print("正の整数：");
			// 入力値を変数に代入する
			intNumber = standardInput.nextInt();
		// 入力値が1未満か判定する
		} while (intNumber < 1);

		// 入力値を呼び出し元に返却する
		return intNumber;
	}
}
