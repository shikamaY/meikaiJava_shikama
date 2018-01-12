package ensyu4;

import java.util.Random;
import java.util.Scanner;

public class Ensyu4_27 {

	public static void main(String[] args) {

		// Randomクラスのオブジェクトを生成する
		Random randomInt = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 0～99のランダムな値を生成する
		int answerNumber = randomInt.nextInt(100);

		// ゲーム開始を宣言する
		System.out.println("数当てゲーム開始！！");
		// どういったゲーム内容か表示する
		System.out.println("0～99の数を当ててください。");

		// 入力値を入れる変数を用意する
		int inputNumberCount;
		// 入力値が正の値でない場合は再入力させる
		do {
			// 何回間違えると答えを表示するか入力するように表示する
			System.out.println("回答回数を正の数で入力してください:");
			// 入力値を変数に代入する
			inputNumberCount = standardInput.nextInt();
		// 入力値が1未満の場合はループ
		} while (inputNumberCount < 1);

		// 入力値を入れる変数を用意する
		int inputNumber;
		// 回答回数をカウントする変数を用意する
		int count = 1;
		do {
			// 入力を促すメッセージを表示する
			System.out.println("いくつかな：");
			// 入力値を変数に代入する
			inputNumber = standardInput.nextInt();

			// 入力値が答えより小さいか判定する
			if (inputNumber > answerNumber) {
				// 結果を表示する
				System.out.println("もっと小さな数だよ。");
			// 入力値が答えより大きいか判定する
			} else if (inputNumber < answerNumber) {
				// 結果を表示する
				System.out.println("もっと大きな数だよ。");
			}

			// 一定数間違えた場合は正解を表示する
			if (count == inputNumberCount) {
				// 正解の数値をを表示する
				System.out.println("正解は" + answerNumber + "です。");
				// ループを抜ける
				break;
			}
			// カウントをインクリメントする
			count++;
		// 正解の場合はループを抜ける
		} while (inputNumber != answerNumber);

		// 回数以内に正解している場合は表示する
		if (count != inputNumberCount) {
			// 正解であることをを表示する
			System.out.println("正解です");
		}
	}

}
