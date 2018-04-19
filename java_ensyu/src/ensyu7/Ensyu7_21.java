package ensyu7;

import java.util.Scanner;

/* 配列aと配列bの全要素の値を交換するメソッドaryExchangを作成せよ
 */

public class Ensyu7_21 {

	public static void main(String[] args) {

		// ユーザに何を作成するか表示する
		System.out.println("１つ目の配列の作成");
		// 配列の作成メソッドを実行する
		int[] intArrayA = creatIntArray();
		// ユーザに何を作成するか表示する
		System.out.println("２つ目の配列の作成");
		// 配列の作成メソッドを実行する
		int[] intArrayB = creatIntArray();
		// 配列Aと配列Bの値を交換する
		aryExchange(intArrayA,intArrayB);
		// 配列Aの要素を表示する
		printIntArray(intArrayA);
		// 配列Bの要素を表示する
		printIntArray(intArrayB);
	}

	/* 二つの配列の値を交換するメソッド
	 * 要素数が等しくない場合は小さいほうの要素数分交換する
	 * intArrayA:1つ目の配列
	 * intArrayB:2つ目の配列
	 */
	static void aryExchange(int[] intArrayA, int[] intArrayB){
		// 要素数の最小値を求めるため、配列Aの要素数を代入する
		int indexCountMin = intArrayA.length;
		// 配列Bの要素数が小さいか判定する
		if(indexCountMin > intArrayB.length) {
			// 要素数を代入する
			indexCountMin = intArrayB.length;
		}

		// 少ないほうの要素数分ループする
		for(int count = 0; count < indexCountMin; count++) {
			// 配列Aの要素をtmpに入れる
			int tmpNumber = intArrayA[count];
			// 配列Aに配列Bの値を入れる
			intArrayA[count] = intArrayB[count];
			// 配列Bにtmpの値を入れる
			intArrayB[count] = tmpNumber;
		}
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

	/* 配列の全要素を表示するメソッド
	 * intArray:表示する配列
	 */
	static void printIntArray(int[] intArray) {
		// 配列の要素数分ループする
		for(int intNumber : intArray) {
			// 各要素の値を表示する
			System.out.print(intNumber + " ");
		}
		// 改行する
		System.out.println();
	}

}
