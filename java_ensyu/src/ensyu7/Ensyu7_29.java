package ensyu7;

import java.util.Scanner;

/* 演習7-29
 * 2次元配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して返却するメソッドaryClone2を作成せよ
 *
 */

public class Ensyu7_29 {

	public static void main(String[] args) {
		// 配列を生成する
		int[][] intArray = creatIntDoualArray();
		// 表示する内容を表示する
		System.out.println("元配列");
		// 配列を表示する
		printMatrix(intArray);
		// 表示する内容を表示する
		System.out.println("コピーした配列");
		// 配列をコピーした結果を表示する
		printMatrix(arayClone2(intArray));
	}

	/* 指定した2次元配列と同じ値の2次元配列を作成するメソッド
	 * intArray:コピーする2次元配列
	 */
	static int[][] arayClone2(int[][] intArray) {

		// 引数と同じ要素数の配列を生成する
		int[][] arrayClone = new int[intArray.length][intArray[0].length];

		// 配列の行数分ループする
		for (int countRow = 0; countRow < intArray.length; countRow++ ) {
			// 配列の列数分ループする
			for (int countColumn = 0; countColumn < intArray[0].length; countColumn++) {
				// 各要素の値を代入する
				arrayClone[countRow][countColumn] = intArray[countRow][countColumn];
			}
		}
		// コピーした配列を返却する
		return arrayClone;
	}

	/* 配列の中身を表示するメソッド
	 * arrayName:配列の名称
	 */
	static void printMatrix(int[][] arrayName) {
		// 配列の行数分ループする
		for (int countRow = 0; countRow < arrayName.length; countRow++){
			// 配列の列数分ループする
			for (int countColumn = 0; countColumn < arrayName[countRow].length; countColumn++) {
				// 各要素の値を出力する
				System.out.print(arrayName[countRow][countColumn] + " ");
			}
			// 改行出力
			System.out.println();
		}
	}

	// 配列をユーザに作成させるメソッド
	static int[][] creatIntDoualArray() {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数(１次):");
		// ユーザからの入力値を代入する
		final int arrayCountFirst = standardInput.nextInt();
		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数（２次）:");
		// ユーザからの入力値を代入する
		final int arrayCountSecond = standardInput.nextInt();
		// 指定された要素数の配列を用意する
		int[][] intDoualArray = new int[arrayCountFirst][arrayCountSecond];

		// 指定されたサイズの配列に値を入れてもらうため、要素数分ループする
		for(int countRow = 0; countRow < arrayCountFirst; countRow++ ) {
			for(int countColumn = 0; countColumn < arrayCountSecond; countColumn++ ) {
				// ユーザへ入力を促すためのメッセージ
				System.out.print("配列[" + countRow + "][" + countColumn + "]:");
				// 入力値を配列に入れる
				intDoualArray[countRow][countColumn] = standardInput.nextInt();
			}

		}
		// 作成した配列を返却する
		return intDoualArray;
	}
}
