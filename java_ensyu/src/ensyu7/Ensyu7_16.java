package ensyu7;

import java.util.Scanner;

/* 演習7-16
 * 配列aの要素の最小値を求めるメソッドminOfを作成せよ
 */

public class Ensyu7_16 {

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

		// 配列の全要素の合計を表示する
		System.out.println(minOf(intArray));
	}

	/* 配列の要素の最小値を求めるメソッド
	 * intArray:計算する対象の配列
	 */
	static int minOf(int[] intArray) {
		// 合計値を入れるための変数,初期値には仮の最小値として
		int intMin = intArray[0];

		// 2つめの要素から残りの要素分ループする
		for(int count = 1; count < intArray.length; count++) {
			// 要素が最小値より小さいか判定する
			if(intMin > intArray[count]){
				// 小さい場合は最小値とする
				intMin =  intArray[count];
			}
		}

		// 最小値を返却する
		return intMin;
	}

}
