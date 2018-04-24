package ensyu7;

import java.util.Scanner;

/* 演習7-23
 * 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納したメソッドarryaSrchIdxを作成せよ
 */

public class Ensyu7_23 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 配列を生成する
		int[] intArray = creatIntArray();

		// ユーザに何を入力するか表示する
		System.out.print("検索値:");
		// 入力値を代入する
		int searchNumber = standardInput.nextInt();
		// 配列のどのインデックスに検索値と同じ値があるかを表示する
		printIntArray(arraySrchIdx(intArray,searchNumber));
	}

	/* 指定値があるインデックス番号を返却するメソッド
	 * intArray:検索する配列
	 * searchNumber:検索値
	 */
	static int[] arraySrchIdx(int[] intArray, int searchNumber) {
		// 検索結果を入れる配列の要素数を決めるための変数
		int hitCount = 0;
		// 対象の配列の要素数分ループする
		for(int intNumber : intArray) {
			// 要素と検索値画一致した場合
			if(intNumber == searchNumber) {
				// hitCountに加算する
				hitCount++;
			}
		}
		// 検索結果を入れる配列を用意する
		int[] indexArray = new int[hitCount];
		// 検索結果を入れるインデックス
		int indexArrayCount = 0;
		// 対象は配列の要素数分ループする
		for(int count = 0; count < intArray.length; count++ ) {
			// 要素と検索値が一致した場合
			if(intArray[count] == searchNumber) {
				// 配列に一致したインデックスを入れる
				indexArray[indexArrayCount] = count;
				// 次のインデックスに結果を入れるため、indexArrayCountに加算する
				indexArrayCount++;
			}
		}

		// インデックス番号を入れた配列を返却する
		return indexArray;
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
