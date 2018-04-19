package ensyu7;

import java.util.Scanner;

/* 演習7-20
 * 配列aの要素a[idx]にｘを挿入するメソッドaryInsを作成せよ
 * 挿入に伴ってa[idx]～a[a.length - 2]をひとつ広報にずらさなければならない
 */
public class Ensyu7_20 {

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
		System.out.print("挿入位置:");
		// 入力された検索位置を代入する
		int targetIndex = standardInput.nextInt();

		// ユーザへ入力を促すためのメッセージ
		System.out.print("挿入値:");
		// 入力された挿入値を変数に代入
		int insertNumber = standardInput.nextInt();
		// 入力値を元に配列に値を代入する
		aryIns(intArray,targetIndex, insertNumber);
	}

	/* 配列の指定したインデックスに値を挿入するメソッド
	 * intArray:挿入する配列
	 * targetIndex:挿入する位置
	 * insertNumber:挿入する数値
	 */
	static void aryIns(int[] intArray,int targetIndex, int insertNumber){

		// 作業用に配列のコピーを作成する
		int[] tmpArray = copyArray(intArray);

		// 指定位置から要素数分ループする
		for(int count = targetIndex; count < intArray.length; count++) {
			// 指定された位置の場合
			if(count == targetIndex) {
				// 指定位置に値を代入する
				intArray[count] = insertNumber;
			// 指定位置以外の場合
			} else {
				// 元配列のcountから-1した位置の値を代入する
				intArray[count] = tmpArray[count - 1];
			}
		}

		// 配列の要素数分ループする
		for(int intNumber : intArray) {
			// 各要素の値を表示する
			System.out.print(intNumber + " ");
		}
	}

	/* 配列をコピーするメソッド
	 * intArray:元の配列
	 */
	static int[] copyArray(int[] intArray) {
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
}
