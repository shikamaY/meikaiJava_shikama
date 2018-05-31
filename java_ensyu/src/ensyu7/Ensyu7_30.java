package ensyu7;

import java.util.Scanner;

/* 演習7-30
 * 二つのint型変数a,bの最小値、3つのint型整数a,b,cの最小値、配列aの要素の最小値を求めるメソッドを作成せよ
 * int min(int a, int b)
 * int min(int a, int b, int c)
 * int min(int[] a)
 */

public class Ensyu7_30 {
	public static void main(String[] args) {
		// 整数Aを作成する
		int intNumberA = createIntNumber("整数A:");
		// 整数Bを作成する
		int intNumberB = createIntNumber("整数B:");
		// 整数Cを作成する
		int intNumberC = createIntNumber("整数C:");
		// 整数の配列を作成する
		int[] intArray = creatIntArray();

		// 二つの整数の最小値を求める
		System.out.println("整数Aと整数Bの最小値:" + min(intNumberA,intNumberB));
		// 三つの整数の最小値を求める
		System.out.println("整数Aと整数Bと整数Cの最小値:" + min(intNumberA,intNumberB,intNumberC));
		// 配列の要素の最小値を求める
		System.out.println("配列の要素の最小値:" + min(intArray));
	}

	/* 2つの整数の最小値を求めるメソッド
	 * intNumberA:比較する整数A
	 * intNumberB:比較する整数B
	 */
	static int min(int intNumberA, int intNumberB) {
		// 最小値を入れる変数を用意（1つ目の整数を仮最小値として代入）
		int min = intNumberA;

		// 2つ目の整数が最小値より小さいか判定する
		if (min > intNumberB) {
			// 最小値に代入する
			min = intNumberB;
		}
		// 最小値を返却する
		return min;
	}

	/* 3つの整数の最小値を求めるメソッド
	 * intNumberA:比較する整数A
	 * intNumberB:比較する整数B
	 * intNumberC:比較する整数C
	 */
	static int min(int intNumberA, int intNumberB, int intNumberC) {
		// 最小値を入れる変数を用意（1つ目の整数を仮最小値として代入）
		int min = intNumberA;

		// 2つ目の整数が最小値より小さいか判定する
		if (min > intNumberB) {
			// 最小値に代入する
			min = intNumberB;
		}
		// 3つ目の整数が最小値より小さいか判定する
		if (min > intNumberC) {
			// 最小値に代入する
			min = intNumberC;
		}
		// 最小値を返却する
		return min;
	}

	/* 配列の要素の最小値を求めるメソッド
	 * intArray:比較する整数A
	 */
	static int min(int[] intArray) {
		// 最小値を入れる変数を用意（1つ目の要素を仮最小値を代入）
		int min = intArray[0];

		// 最小値を求めるため、配列の要素数分ループする
		for (int count = 1; count < intArray.length; count++ ) {
			// 最小値より小さいか判定する
			if (min > intArray[count]) {
				// 最小値を代入する
				min = intArray[count];
			}
		}
		// 最小値を返却する
		return min;
	}

	/* ユーザに整数を入力させるメソッド
	 * message:入力する内容
	 */
	static int createIntNumber(String message) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);
		// ユーザへ入力を促すためのメッセージ
		System.out.print(message);
		// ユーザからの入力値を代入する
		int inputNumber = standardInput.nextInt();
		// 値を返却する
		return inputNumber;
	}
	// 配列をユーザに作成させるメソッド
	static int[] creatIntArray() {
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
		// 作成した配列を返却する
		return intArray;
	}
}
