package ensyu6;

import java.util.Scanner;

/* 演習6-18
 * 行数・各行の列数・要素数の値をキーボードから読み込むようにList6-18を書き換えたプログラムを作成せよ
 */
public class Ensyu6_18 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザが作成するために空の配列を用意する
		int[][] inputArray;
		// ユーザに行数を入力してもらうために表示する
		System.out.print("行数：");
		// 行数を決めるため、入力値を代入する
		int rawLines = standardInput.nextInt();
		// 入力値を元に指定行の配列を作成する
		inputArray = new int[rawLines][];
		// 列数と各要素を入力するため、行数分ループする
		for (int rawCount = 0; rawCount < inputArray.length ; rawCount++) {
			// 列数を決めるため、入力値を代入する
			System.out.print("列数：");
			// 列数を決めるため、入力値を代入する
			int columnLines = standardInput.nextInt();
			// 各行の列を作成する
				inputArray[rawCount] = new int[columnLines];
			// 各要素を入力するため、列数分ループする
			for (int columnCount = 0; columnCount < inputArray[rawCount].length; columnCount++ ) {
				// 要素の入力を促すメッセージを表示する
				System.out.print("整数の要素" + (columnCount + 1) + ":");
				// 入力値を各要素に代入する
				inputArray[rawCount][columnCount] = standardInput.nextInt();
			}
		}

		// 入力結果を表示するため、行数分ループする
		for (int rawCount = 0; rawCount < inputArray.length ; rawCount++) {
			// 入力結果を表示するため、列数分ループする
			for (int columnCount = 0; columnCount < inputArray[rawCount].length; columnCount++ ) {
				// 対象の要素を表示する
				System.out.printf("%3d",inputArray[rawCount][columnCount]);
			}
			// 行ごとに改行する
			System.out.println();
		}

	}

}
