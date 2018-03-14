package ensyu7;

import java.util.Random;
import java.util.Scanner;

/* 演習7-10
 * List7-11を拡張して、4つの問題をランダムに出題するプログラムを作成せよ
 */

public class Ensyu7_10 {

	public static void main(String[] args) {
		// 乱数を生成するため、Randomクラスのオブジェクトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ランダムで出力する数値の最小値
		final int minNumber = 100;
		// ランダムで出力する数値の最大値
		final int maxNumber = 900;
		// ランダムで出力する問題数の最大値
		final int quetionNumber = 4;
		// ユーザに処理内容分かるように表示する
		System.out.println("暗算力トレーニング");
		// 問題に正解し、ユーザが処理を終了することを選択するまでループする
		do {
			// 計算する1つ目の数値を乱数で生成する
			int firstNumber = rand.nextInt(maxNumber) + minNumber;
			// 計算する2つ目の数値を乱数で生成する
			int secondNumber = rand.nextInt(maxNumber) + minNumber;
			// 計算する3つ目の数値を乱数で生成する
			int thirdNumber = rand.nextInt(maxNumber) + minNumber;
			// 計算問題を乱数で決定する
			int questionRand = rand.nextInt(quetionNumber);
			// ユーザの解答が正解か判定するためのフラグ
			boolean answerFlag = false;
			// 問題に正解するまでループする
			do {
				// ユーザに問題を表示し、答えを計算を行う
				int testAnswer = questionChoice(firstNumber,secondNumber,thirdNumber,questionRand);
				// ユーザに計算結果を入力してもらう
				int userAnswer = standardInput.nextInt();
				// 問題の答えとユーザの答えがあっているか判定する
				if (testAnswer == userAnswer) {
					// ループから抜けるため、正解の場合はfalseにする
					answerFlag = false;
				// 間違っている場合
				} else {
					// 間違っていることを表示する
					System.out.println("違います。");
					// 再度解答させるためにtrueにする
					answerFlag = true;
				}
			// 不正解の場合はループする
			} while (answerFlag);
		// ユーザに新たに問題を出すかを聞く
		} while (confirmRetry());
	}

	// 問題を再出題するかユーザに確認するメソッド
	static boolean confirmRetry(){
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザの入力値を入れる変数
		int count;
		// 正しい値が入れられるまでループする
		do {
			// ユーザに何を入力するか表示する
			System.out.print("もう一度？<yes･･･1/No･･･0>");
			// 入力値を変数に代入する
			count = standardInput.nextInt();
		// 入力値チェックを行う
		} while (count != 0 && count !=1);
		// 入力値が1ならtrue,0ならflaseを返却する
		return count == 1;
	}

	/* 計算問題を出力し、問題の答えを返却するメソッド
	 * firstNumber:計算する1つ目の数値
	 * secondNumber:計算する2つ目の数値
	 * thirdNumber:計算する3つ目の数値
	 * questionNumber:計算問題を決める数値
	 */
	static int questionChoice(int firstNumber, int secondNumber, int thirdNumber , int questionNumber) {
		// 計算結果を入れる変数
		int questionAnswer = 0;
		// questionNumberが0の場合
		if (questionNumber == 0) {
			// ユーザに計算問題を出力する
			System.out.print(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = ");
			// 答えを計算する
			questionAnswer = firstNumber + secondNumber + thirdNumber;
		// questionNumberが1の場合
		} else if (questionNumber == 1) {
			// ユーザに計算問題を出力する
			System.out.print(firstNumber + " + " + secondNumber + " - " + thirdNumber + " = ");
			// 答えを計算する
			questionAnswer = firstNumber + secondNumber - thirdNumber;
		// questionNumberが2の場合
		} else if (questionNumber == 2) {
			// ユーザに計算問題を出力する
			System.out.print(firstNumber + " - " + secondNumber + " + "  + thirdNumber + " = ");
			// 答えを計算する
			questionAnswer = firstNumber - secondNumber + thirdNumber;
		// questionNumberが3の場合
		} else if (questionNumber == 3) {
			// ユーザに計算問題を出力する
			System.out.print(firstNumber + " - " + secondNumber + " - " + thirdNumber + " = ");
			// 答えを計算する
			questionAnswer = firstNumber - secondNumber - thirdNumber;
		}
		return questionAnswer;
	}
}
