package ensyu7;

import java.util.Scanner;

/* 演習7-12
 * 整数を右にnビット回転した値を返すメソッドrRotateと、左にnビット回転した値を返すメソッドlRotateを作成せよ
 *
 */
public class Ensyu7_12 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("整数:");
		// ユーザからの入力値を代入する
		int intNumber = standardInput.nextInt();

		// ユーザへ入力を促すためのメッセージ
		System.out.print("回転数:");
		// ユーザからの入力値を代入する
		int rotateNumber = standardInput.nextInt();

		// 比較をしやすくするため、入力された整数をビット表示する
		System.out.println(rRotate(intNumber,0));
		// 入力値をもとに右ビット回転させる
		System.out.println(rRotate(intNumber,rotateNumber));
		// 入力値をもとに左ビット回転させる
		System.out.println(lRotate(intNumber,rotateNumber));
	}

	/* 整数を右にビット回転させるメソッド
	 * intNumber:ビット回転させる整数
	 * rotateNumber:いくつシフトするかを決める値
	 */
	static int rRotate(int intNumber, int rotateNumber) {
		// 回転させたビット表示を入れる変数
		String rotateResult = "";
		// 下位ビットを上位ビットに持ってくるため、シフトする数値分ループする
		for (int count = rotateNumber; count > 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			rotateResult += ((intNumber >>> count - 1 & 1) == 1) ? '1' : '0';
		}

		// 残りの数値をビット表示するため、32回 - シフト数分ループする
		for (int count = 31; count >= rotateNumber; count--) {
			// countのビット数が1か判定して1か0を表示する
			rotateResult += ((intNumber >>> count & 1) == 1) ? '1' : '0';
		}
		// 回転した結果をビット表示する
		System.out.println(rotateResult);
		// 整数に変換して返却する
		return bitConversion(rotateResult);
	}

	/* 整数を左にビット回転させるメソッド
	 * intNumber:ビット回転させる整数
	 * rotateNumber:いくつシフトするかを決める値
	 */
	static int lRotate(int intNumber, int rotateNumber) {
		// 回転させたビット表示を入れる変数
		String rotateResult = "";
		// 左にシフトするため先頭の上位ビットを下位ビットにシフトするようにシフト数値分ループする
		for (int count = 31 - rotateNumber; count >= 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			rotateResult += ((intNumber >>> count & 1) == 1) ? '1' : '0';
		}

		// 残りの数値をビット表示するため、32回 - シフト数分ループする
		for (int count = 31; count > 31 - rotateNumber; count--) {
			// countのビット数が1か判定して1か0を表示する
			rotateResult += ((intNumber >>> count & 1) == 1) ? '1' : '0';
		}
		// 回転した結果をビット表示する
		System.out.println(rotateResult);
		// 整数に変換して返却する
		return bitConversion(rotateResult);
	}


	/* ビット表示された値を整数に変換するメソッド
	 * bitString:ビット表示された値
	 */
	static int bitConversion(String bitString){
		// 変換した値を入れる変数
		int intResult = 0;

		// 一文字ずつ計算するため、文字数分ループする
		for (int count = 0; count < bitString.length(); count++) {
			// 各桁の数値を抜き出す
			String stringNum = bitString.substring(count, count + 1);

			// 抜き出した数値が１の場合は計算する
			if (stringNum.equals("1")) {
				// 桁数にあわせた乗数を加算する
				intResult += intMultiplication(1, bitString.length() - count -1);
			}
		}

		// 変換した結果を返却する
		return intResult;
	}

	/* 2の乗数を計算するメソッド
	 * intNum:2の乗数にかける値
	 * multiplicationNumber:何乗するか決めるための値
	 */
	static int intMultiplication(int intNum, int multiplicationNumber) {
		// 結果を入れる変数※0乗の場合は1となるため、初期値を1にする
		int multiplicationResult = 1;
		// 指定した２の乗数を求める
		for (int count = 0; count < multiplicationNumber; count++) {
			multiplicationResult *= 2;
		}
		// 乗数をかけた値を返却する
		return intNum * multiplicationResult;
	}

}
