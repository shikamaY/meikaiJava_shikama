package ensyu7;

import java.util.Scanner;

/* 演習7-26
 * 配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成せよ
 */
public class Ensyu7_26 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 配列を生成する
		int[] intArray = creatIntArray();

		// ユーザに何を入力するか表示する
		System.out.print("追加するインデックス:");
		// 入力値を代入する
		int addIndex = standardInput.nextInt();
		// ユーザに何を入力するか表示する
		System.out.print("追加する値:");
		// 入力値を代入する
		int addNumber = standardInput.nextInt();
		// 指定されたインデックスに値を入れた結果を表示する
		printIntArray(arrayInsOf(intArray,addIndex,addNumber));
	}

	/* 指定されたインデックスの値を削除するメソッド
	 * intArray:検索する配列
	 * addIndex:追加するインデックス
	 * addNumber:追加する値
	 */
	static int[] arrayInsOf(int[] intArray, int addIndex, int addNumber) {
		// 結果を入れる配列を用意する
		int[] resultArray = new int[intArray.length + 1];
		// 結果を入れる配列の要素数分ループする
		for(int count = 0; count < resultArray.length; count++ ) {
			// 指定されたインデックスの場合
			if (count == addIndex) {
				// 指定されたインデックスに値を代入する
				resultArray[count] = addNumber;
			// 指定されたインデックス以降の場合
			} else if(count > addIndex) {
				// 元配列の指定された位置-1の要素を代入する
				resultArray[count] = intArray[count - 1];
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
		final int arrayCount = standardInput.nextInt();
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
