package ensyu7;

import java.util.Scanner;

/* 演習7-18
 * 配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ
 * 削除はa[idx]より後ろの全要素をひとつ前方にずらして行うこと
 * あまってしまう末尾要素は変更しなくてよい
 */
public class Ensyu7_18 {

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

		// 指定位置の値を削除して表示する
		aryRmv(intArray,targetIndex);
	}

	/* 指定されたインデックスの値を削除して左につめるメソッド
	 * intArray:処理対象の配列
	 * targetIndex:削除するインデックス番号
	 */
	static void aryRmv(int[] intArray, int targetIndex) {

		// 指定位置から要素数分ループする
		for(int count = targetIndex; count < intArray.length; count++) {
			// あまりの数の場合
			if(count >= intArray.length -1) {
				// 置き換えないため、処理なし
				continue;
			} else {
				// 元の位置の隣の値を入れる
				intArray[count] = intArray[count + 1];
			}
		}

		// 配列の要素数分ループする
		for(int intNumber : intArray) {
			// 各要素の値を表示する
			System.out.print(intNumber + " ");
		}
	}

}
