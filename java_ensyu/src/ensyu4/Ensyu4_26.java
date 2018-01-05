package ensyu4;

import java.util.Scanner;

public class Ensyu4_26 {

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
		int numberCount = 0;
		// 入力値分ループする
		for (int count = 0; count < inputNumber; count++) {
			// 入力を促すメッセージを表示する
			System.out.println("整数:");
			// 入力値を変数に入れる
			int InputNum = standardInput.nextInt();
			// 入力値が０以下か判定する
			if (InputNum < 0) {
				// 処理内容を表示する
				System.out.println("負の数は加算しません");
				// 次のループに行く
				continue;
			}
			// 合計値に入力値を加算する
			sum += InputNum;
			// 入力値の個数に加算する
			numberCount++;
		}
		// 結果を表示する
		System.out.println("合計値は" + sum + "です。");
		// 結果を表示する
		System.out.println("平均値は" + sum / numberCount + "です。");
	}

}
