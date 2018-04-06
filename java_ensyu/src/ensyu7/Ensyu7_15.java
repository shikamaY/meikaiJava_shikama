package ensyu7;

import java.util.Scanner;

/* 演習7-15
 * 配列aの全要素の合計を求めるメソッドsumOfを作成せよ
 *
 */
public class Ensyu7_15 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数:");
		// ユーザからの入力値を代入する
		int arrayCount = standardInput.nextInt();
		// 指定された要素数の配列を用意する
		int[] intArray = new int[arrayCount];

		// 指定されたサイズの配列に値を入れてもらうため、要素数分ループする
		for(int count = 0; count < arrayCount; count++ ) {
			// ユーザへ入力を促すためのメッセージ
			System.out.print("配列[" + count + "]:");
			// 入力値を配列に入れる
			intArray[count] = standardInput.nextInt();
		}

		// 配列の全要素の合計を表示する
		System.out.println(sumOf(intArray));

	}

	/* 配列の全要素を計算するメソッド
	 * intArray:計算する対象の配列
	 */
	static int sumOf(int[] intArray) {
		// 合計値を入れるための変数
		int arraySum = 0;
		// 配列の全要素分ループする
		for(int intNumber : intArray) {
			// 各要素を合計値に加算していく
			arraySum += intNumber;
		}

		// 合計値を返却する
		return arraySum;
	}


}
