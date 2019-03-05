package Ensyu16;

import java.util.Scanner;

/* 演習16-4
 * List16-7のメソッドreverseは、仮引数aに受け取った参照が空参照でないことを前提としている
 * 受け取ったのが空参照であった場合に何らかの対処を行うように変更したプログラムを作成せよ
 */
public class Ensyu16_4 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すメッセージ
		System.out.print("要素数:");
		// 入力値を変数に代入する
		int number = standardInput.nextInt();

		// 配列を用意する
		int[] numberArray = new int[number];

		// 配列に値を入れるため、要素数分ループする
		for (int count = 0; count < number; count++){
			// 各要素に入力するように表示する
			System.out.print("numberArray[" + count + "]:");
			// 各要素に入力値を代入
			numberArray[count] = standardInput.nextInt();
		}

		// エラーハンドリング
		try {
			// 入れ替えメソッドを実行（NullPointerExceptionを出すために引数をnullにして実行）
			// reverse(numberArray);
			reverse(null);

			// 結果メッセージの表示
			System.out.println("要素の並びを反転しました");
			// 要素数分ループする
			for (int count = 0; count < number; count++) {
				// 各要素の値を表示する
				System.out.println("intArray[" + count + "] = " + numberArray[count]);
			}
		// スローされたエラーの検知
		} catch (RuntimeException e) {
			// エラー内容の表示
			System.out.println("例外      :" + e);
			// エラー内容の表示
			System.out.println("例外の原因:" + e.getCause());
		}
	}

	// 配列の要素を入れ替えるメソッド
	static void swap(int[] intArray, int index1, int index2) {
		// インデックス１の値を仮の変数に代入
		int intTmp = intArray[index1];
		// インデックス2の値をインデックス1に代入
		intArray[index1] = intArray[index2];
		// 仮変数の値をインデックス２に代入
		intArray[index1] = intTmp;
	}

	// 配列の要素を反転させるメソッド
	static void reverse(int[] intArray) {
		// エラーハンドリング
		try {
			// 配列の要素数の半分ループする
			for (int count = 0; count < intArray.length / 2; count++) {
				// 配列の要素の入れ替え
				swap(intArray,count,intArray.length - count);
			}
		// 配列の範囲外を指定した場合
		} catch (ArrayIndexOutOfBoundsException e) {
			// 例外を別の例外としてメソッドの呼び出し元に渡す
			throw new RuntimeException("reverseのバグ？",e);
		// NullPointerExceptionが発生した場合
		} catch (NullPointerException e) {
			// 例外を別の例外としてメソッドの呼び出し元に渡す
			throw new RuntimeException("引数がNullです。",e);
		}
	}
}