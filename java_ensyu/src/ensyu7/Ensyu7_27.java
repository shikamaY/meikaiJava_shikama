package ensyu7;

import java.util.Scanner;

/* 演習7-27
 * List7-20のプログラムは、3つの配列x,y,zの行数および列数が同一であることを前提としている
 * 三つ目の配列の要素が等しければ加算をおこなってtrueを返し、等しくなければ加算を行わずにflaseを返す
 * メソッドに書き換えよ
 */

public class Ensyu7_27 {

	public static void main(String[] args) {
		// 計算するための配列を指定の値で生成する
		int[][] intArrayA = creatIntDoualArray();
		// 計算するための配列を指定の値で生成する
		int[][] intArrayB = creatIntDoualArray();
		// 計算するための配列を初期値で生成する
		int[][] intArrayC = creatIntDoualArrayNew();

		// 配列Aと配列Bの値を加算するメソッドを実行する
		addMatrix(intArrayA,intArrayB,intArrayC);
		// 表示する内容を表示する
		System.out.println("行列A");
		// 配列Aの要素を表示する
		printMatrix(intArrayA);
		// 表示する内容を表示する
		System.out.println("行列B");
		// 配列Bの要素を表示する
		printMatrix(intArrayB);
		// 表示する内容を表示する
		System.out.println("行列C");
		// 配列Cの要素を表示する
		printMatrix(intArrayC);

	}

	/* 配列Aと配列Bの各要素を足した値を配列Cに代入するメソッド
	 * intArrayA:配列A
	 * intArrayB:配列B
	 * intArrayB:結果を入れるための配列C
	 */
	static boolean addMatrix(int[][] intArrayA, int[][] intArrayB, int[][] intArrayC) {
		// 各配列の行数が同じか判定する
		if (intArrayA.length == intArrayB.length || intArrayB.length == intArrayC.length) {
			// 各行の列数が同じか判定するため、配列Aの列数分ループする
			for (int count = 0; count < intArrayA.length; count++) {
				// 列数が同じか判定する
				if (intArrayA[count].length != intArrayB[count].length || intArrayB[count].length != intArrayC[count].length) {
					// 異なっている場合のメッセージを出力する
					System.out.println("配列の要素数が異なるため計算を行いません");
					// 計算を行わないため、falseを返却する
					return false;
				}
			}
			// 各要素の値を加算するため、行数分ループする
			for (int countRow = 0; countRow < intArrayA.length; countRow++) {
				// 各要素の値を加算するため、列数分ループする
				for (int countColumn = 0; countColumn < intArrayA[countRow].length; countColumn++) {
					// 配列Aと配列Bの各要素を加算した値を配列Cに代入する
					intArrayC[countRow][countColumn] = intArrayA[countRow][countColumn] + intArrayB[countRow][countColumn];
				}
			}
			// 正常に処理が終わったため、trueを返却する
			return true;
		}
		// 異なっている場合のメッセージを出力する
		System.out.println("配列の要素数が異なるため計算を行いません");
		// 計算を行わないため、falseを返却する
		return false;
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

	// 指定された要素数の配列を初期値で作成するメソッド
	static int[][] creatIntDoualArrayNew() {
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


		// 作成した配列を返却する
		return intDoualArray;
	}
}
