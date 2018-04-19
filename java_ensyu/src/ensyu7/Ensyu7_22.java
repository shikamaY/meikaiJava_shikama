package ensyu7;

import java.util.Scanner;

/* 演習7-22
 * 配列aと同じ配列を生成して返却するメソッドarrayCloneを作成せよ
 */
public class Ensyu7_22 {

	public static void main(String[] args) {
		// 配列を生成する
		int[] intArray = creatIntArray();
		// 配列をコピーする
		int[] intArrayCopy = arrayClone(intArray);
		// コピーした配列を表示する
		printIntArray(intArrayCopy);
	}

	/* 配列をコピーするメソッド
	 * intArray:元の配列
	 */
	static int[] arrayClone(int[] intArray) {
		// コピー先の配列を用意する
		int[] copyArray = new int[intArray.length];
		// コピーのため、要素数分ループ
		for(int count = 0; count < intArray.length; count++) {
			// 各インデックスの値を代入する
			copyArray[count] = intArray[count];
		}
		// コピーした配列を返却する
		return copyArray;
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
