package ensyu7;

import java.util.Scanner;

/* 演習7-25
 * 配列aから要素a[idx]より後ろの全要素をn個の要素を削除した配列を返却するメソッドarrayRmvOfNを作成せよ
 */
public class Ensyu7_25 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 配列を生成する
		int[] intArray = creatIntArray();

		// ユーザに何を入力するか表示する
		System.out.print("削除するインデックスの先頭:");
		// 入力値を代入する
		int removeIndex = standardInput.nextInt();

		// ユーザに何を入力するか表示する
		System.out.print("個数:");
		// 入力値を代入する
		int removeIndexCount = standardInput.nextInt();
		// 指定されたインデックスを削除した結果を表示する
		printIntArray(arrayRmvOfN(intArray,removeIndex,removeIndexCount));
	}

	/* 指定されたインデックスの値を先頭に指定された数を削除するメソッド
	 * intArray:検索する配列
	 * removeIndex:削除するインデックスの先頭
	 * removeIndexCount:削除する個数
	 */
	static int[] arrayRmvOfN(int[] intArray, int removeIndex, int removeIndexCount) {
		// 結果を入れる配列を用意する
		int[] resultArray = new int[intArray.length - removeIndexCount];
		// 対象は配列の要素数 -removeIndexCount 分ループする
		for(int count = 0; count < resultArray.length; count++ ) {
			// 指定されたインデックス以降の場合
			if(count >= removeIndex) {
				// 指定された値をremoveIndexCount分飛ばした要素を代入する
				resultArray[count] = intArray[count + removeIndexCount];
			// 指定されたインデックス以前の場合
			} else {
				// 元配列と同じ値を代入する
				resultArray[count] = intArray[count];
			}
		}
		// インデックス番号を入れた配列を返却する
		return resultArray;
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
