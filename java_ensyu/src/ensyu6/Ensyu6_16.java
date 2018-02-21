package ensyu6;

import java.util.Scanner;

/* 演習6-16
 * 4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ
 * 各要素の値はキーボードから読み込むこと
 */

public class Ensyu6_16 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 4行3列の配列を用意
		int[][] fourRowThreeColumArray = new int[4][3];
		// 3行4列の配列を用意
		int[][] threeRowFourColumArray = new int[3][4];
		// 計算した結果を入れる配列を用意
		int[][]  productResult = new int[4][3];
		// 4行3列の配列に値を入れるため、4回ループする
		for (int rowCount = 0; rowCount < fourRowThreeColumArray.length; rowCount++ ) {
			// 各行の各列に値を入れるため、3回ループする
			for (int columnCount = 0; columnCount < fourRowThreeColumArray[rowCount].length; columnCount++) {
				// どの要素に値を入れるかユーザに分かるように表示する
				System.out.print("[" + rowCount + "]" + "[" + columnCount +"]（整数）:");
				// 入力された値を各要素に代入する
				fourRowThreeColumArray[rowCount][columnCount] = standardInput.nextInt();
			}
		}
		// 3行4列の配列に値を入れるため、3回ループする
		for (int rowCount = 0; rowCount < threeRowFourColumArray.length; rowCount++ ) {
			// 各行の各列に値を入れるため、4回ループする
			for (int columnCount = 0; columnCount < threeRowFourColumArray[rowCount].length; columnCount++) {
				System.out.print("[" + rowCount + "]" + "[" + columnCount +"]（整数）:");
				// 入力された値を各要素に代入する
				threeRowFourColumArray[rowCount][columnCount] = standardInput.nextInt();
			}
		}

		// 二つの行列の積を計算するため、4回ループする
		for (int rowCount = 0; rowCount < fourRowThreeColumArray.length; rowCount++ ) {
			// 各行の列ごとに計算を行うため、3回ループする
			for (int columnCount = 0; columnCount < fourRowThreeColumArray[rowCount].length; columnCount++) {
				// 掛け合わせる要素を指定し、計算結果を出すため、4回ループする
				for (int subCount = 0; subCount < fourRowThreeColumArray[rowCount].length; subCount++){
					// subCountで計算する要素を指定して積を求め、各要素に加算していく
					productResult[rowCount][columnCount] += fourRowThreeColumArray[rowCount][subCount] * threeRowFourColumArray[subCount][columnCount];
				}
			}
		}

		// 計算結果を表示するため、4回ループする
		for (int rowCount = 0; rowCount < productResult.length; rowCount++ ) {
			// 各列の各行の要素を表示するため、3回ループする
			for (int columnCount = 0; columnCount < productResult[rowCount].length; columnCount++) {
				// 要素を表示する
				System.out.print(productResult[rowCount][columnCount] + " ");
			}
			// 行列の形に表示するため、改行する
			System.out.println();
		}
 	}

}
