package ensyu4;

import java.util.Scanner;

/*演習4-24
 * 正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ
 */

public class Ensyu4_24 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すメッセージを表示する
		System.out.println("正の整数:");
		// 入力値を変数に入れる
		int inputNum = standardInput.nextInt();

		// 正の値か判定する
		if (inputNum < 1) {
			// 正しい入力をするように表示する
			System.out.println("正の整数を入力してください");
			// 処理を終了する
			return;
		}

		// 素数か確認するため2から入力値までループする
		for (int count = 2; count < inputNum; count++) {
			// 入力値がcountで割り切れるか判定する
			if (inputNum % count == 0) {
				// 素数でないことを表示する
				System.out.println("素数ではありません");
				// 他の値を確認する必要がないため、ループを抜ける
				break;
			// 最終ループか判定する
			} else if (count == inputNum - 1) {
				// 結果を表示する
				System.out.println("素数です");
			}
		}
	}

}
