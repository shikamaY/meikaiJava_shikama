package ensyu4;

import java.util.Scanner;

/*演習4-25
 * 合計だけでなく平均も求めるようにList4-17（p.126)およびList4-18（p.127）のプログラムを書き換えよ
 */

public class Ensyu4_25b {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 処理内容を表示する
		System.out.println("整数を加算します。");
		// 入力を促すメッセージを表示する
		System.out.println("何個加算しますか:");
		// 入力値を変数に入れる
		int inputNumber = standardInput.nextInt();

		// 合計値
		int sum = 0;
		// 入力値の個数
		int nemberCount = inputNumber;
		// 入力値分ループする
		for (int count = 0; count < inputNumber; count++) {
			// 入力を促すメッセージを表示する
			System.out.println("整数（0で終了）:");
			// 入力値を変数に入れる
			int inputNum = standardInput.nextInt();
			// 入力値が０か判定する
			if (sum + inputNum > 1000) {
				// 状態を表示する
				System.out.println("合計が1,000を超えました。");
				// 処理内容を表示する
				System.out.println("最後の数値は無視します。");
				// ループ回数分をnemberCountに入れる
				nemberCount = count;
				// ループを抜ける
				break;
			}
			// 合計値に入力値を加算する
			sum += inputNum;
		}
		// 結果を表示する
		System.out.println("合計値は" + sum + "です。");
		// 結果を表示する
		System.out.println("平均値は" + sum / nemberCount + "です。");
	}

}
