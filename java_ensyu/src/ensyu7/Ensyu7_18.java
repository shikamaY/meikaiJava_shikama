package ensyu7;

import java.util.Scanner;

/* 演習7-18
 * 配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ
 * 削除はa[idx]より後ろの全要素をひとつ前方にずらして行うこと
 * あまってしまう末尾要素は変更しなくてよい
 */
public class Ensyu7_18 {

	public static void main(String[] args) {
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

		// 指定位置の値を削除して表示する
		aryRmv(intArray,targetIndex);
	}

	/* 指定されたインデックスの値を削除して左につめるメソッド
	 * intArray:処理対象の配列
	 * targetIndex:削除するインデックス番号
	 */
	static void aryRmv(int[] intArray, int targetIndex) {
		// 処理結果を入れる作業用配列を用意する
		int[] tmpArray = new int[intArray.length];

		// 配列の要素数分ループする
		for(int count = 0; count < intArray.length; count++) {
			// 指定された位置以降の場合
			if(count >= targetIndex) {
				// あまりの数値の場合
				if(count >= intArray.length -1) {
					// 元配列と同じ値を入れる
					tmpArray[count] = intArray[count];
				} else {
					// 元の位置の隣の値を入れる
					tmpArray[count] = intArray[count + 1];
				}
			// 指定位置より前の場合
			} else {
				// 元配列と同じ値を入れる
				tmpArray[count] = intArray[count];
			}
		}

		// 配列の要素数分ループする
		for(int intNumber : tmpArray) {
			// 各要素の値を表示する
			System.out.print(intNumber + " ");
		}
	}

}
