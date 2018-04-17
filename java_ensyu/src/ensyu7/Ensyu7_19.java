package ensyu7;

import java.util.Scanner;

/* 演習7-19
 * 配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvnを作成せよ
 */
public class Ensyu7_19 {

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

		// ユーザへ入力を促すためのメッセージ
		System.out.print("削除位置:");
		// 検索キーとして扱うため、入力値を変数に代入
		int targetIndex = standardInput.nextInt();

		// ユーザへ入力を促すためのメッセージ
		System.out.print("削除数:");
		// 検索キーとして扱うため、入力値を変数に代入
		int removeCount = standardInput.nextInt();

		aryRmvN(intArray,targetIndex,removeCount);
	}

	/* 指定されたインデックスの値から指定された位置まで削除して値をつめるメソッド
	 * intArray:処理対象の配列
	 * targetIndex:削除するインデックス番号
	 * removeCount:削除する個数
	 */
	static void aryRmvN(int[] intArray, int targetIndex, int removeCount) {
		// 指定位置から要素数分ループする
		for(int count = targetIndex; count < intArray.length; count++) {
			// あまりの数の場合
			if(count + removeCount > intArray.length -1) {
				// 置き換えないため、処理なし
				continue;
			} else {
				// 指定された数だけ加算した位置の値を入れる
				intArray[count] = intArray[count + removeCount];
			}
		}

		// 配列の要素数分ループする
		for(int intNumber : intArray) {
			// 各要素の値を表示する
			System.out.print(intNumber + " ");
		}
	}
}
