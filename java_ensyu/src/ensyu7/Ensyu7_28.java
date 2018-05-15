package ensyu7;

import java.util.Scanner;

/* 演習7-28
 * 行列xとyの和を格納した2次元配列を返すメソッドを作成せよ（行数および列数が同一の配列をｘとyに受け取ることを前提としてよい）
 */

public class Ensyu7_28 {

	public static void main(String[] args) {
		// 計算するための配列を指定の値で生成する
		int[][] intArrayA = creatIntDoualArray();
		// 計算するための配列を指定の値で生成する
		int[][] intArrayB = creatIntDoualArray();

		// 配列Aと配列Bの値を加算するメソッドを実行する
		// 表示する内容を表示する
		System.out.println("行列A");
		// 配列Aの要素を表示する
		printMatrix(intArrayA);
		// 表示する内容を表示する
		System.out.println("行列B");
		// 配列Bの要素を表示する
		printMatrix(intArrayB);
		// 表示する内容を表示する
		System.out.println("計算結果");
		// 配列Cの要素を表示する
		printMatrix(addMatrix(intArrayA,intArrayB));

	}

	/* 配列Aと配列Bの各要素を足した値を配列に代入するメソッド
	 * intArrayA:配列A
	 * intArrayB:配列B
	 */
	static int[][] addMatrix(int[][] intArrayA, int[][] intArrayB) {

		// 計算結果を入れる配列を作成する
		int[][] intArrayResult = new int[intArrayA.length][intArrayA[0].length];

		// 各要素の値を加算するため、行数分ループする
		for (int countRow = 0; countRow < intArrayA.length; countRow++) {
			// 各要素の値を加算するため、列数分ループする
			for (int countColumn = 0; countColumn < intArrayA[countRow].length; countColumn++) {
					// 配列Aと配列Bの各要素を加算した値を配列Cに代入する
					intArrayResult[countRow][countColumn] = intArrayA[countRow][countColumn] + intArrayB[countRow][countColumn];
				}
		}
		return intArrayResult;
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
		int arrayCountFirst = standardInput.nextInt();
		// ユーザへ入力を促すためのメッセージ
		System.out.print("配列の要素数（２次）:");
		// ユーザからの入力値を代入する
		int arrayCountSecond = standardInput.nextInt();
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
