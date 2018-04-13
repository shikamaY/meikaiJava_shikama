package ensyu7;

import java.util.Scanner;

/* 演習7-17
 * メソッドlinearSearchは探索するキーと同じ値の要素が複数個存在する場合、もっとも先頭に位置する要素を見つけるものである。
 * もっとも末尾側にいちする要素を見つけるメソッドlinearSearchRを作成せよ
 */
public class Ensyu7_17 {

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
		System.out.print("検索値:");
		// 検索キーとして扱うため、入力値を変数に代入
		int searchKey = standardInput.nextInt();

		// 検索結果を取得する
		int searchResult = linearSearchR(intArray,searchKey);
		// 検索結果が-1（一致なしの場合）
		if(searchResult == -1) {
			// 検索対象がないことを表示する
			System.out.println("検索対象が配列内にありませんでした。");
		// 検索結果がある場合
		} else {
			// 指定した値でもっとも末尾側にある位置を表示する
			System.out.println("その値がもっとも末尾側にあるインデックスは[" + searchResult + "]です");
		}
	}

	/* 指定した値が配列内にある場合、先頭に位置するインデックスを返却する
	 * intArray:検索対象の配列
	 * searchKey:検索する値
	 */
	static int linearSearch(int[] intArray, int searchKey) {
		// 配列内の値を調べるため、要素数分ループする
		for(int i = 0; i < intArray.length; i++) {
			// 指定された値と一致する場合
			if(intArray[i] == searchKey) {
				// 最初にヒットする位置だけでいいため、一致したインデックを返却する。
				return i;
			}
		}
		// ヒットしない場合は-1を返す
		return -1;
	}

	/* 指定した値が配列内にある場合、最後に位置するインデックスを返却する
	 * intArray:検索対象の配列
	 * searchKey:検索する値
	 */
	static int linearSearchR(int[] intArray, int searchKey) {
		// 配列内の値を調べるため、要素数分逆からループする
		for(int i = intArray.length - 1; i >= 0; i--) {
			// 指定された値と一致する場合
			if(intArray[i] == searchKey) {
				// 配列の末尾側の値がヒットする位置だけでいいため、一致したインデックを返却する。
				return i;
			}
		}
		// ヒットしない場合は-1を返す
		return -1;
	}

}
