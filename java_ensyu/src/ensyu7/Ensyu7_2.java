package ensyu7;

import java.util.Scanner;

/* 演習7-2
 * 三つのint型引数a,b,cの最小値を求めるメソッドを作成せよ
 */

public class Ensyu7_2 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

			// ユーザに1つめの値を入力してもらうために表示する
			System.out.print("整数A：");
			// 入力値を変数に代入する
			int intNumberA = standardInput.nextInt();
			// ユーザに2つめの値を入力してもらうために表示する
			System.out.print("整数B：");
			// 入力値を変数に代入する
			int intNumberB = standardInput.nextInt();
			// ユーザに3つめの値を入力してもらうために表示する
			System.out.print("整数C：");
			// 入力値を変数に代入する
			int intNumberC= standardInput.nextInt();

		// 入力値の判定を行うため、入力値を引数にsignOfメソッドを実行し、結果を表示する
		System.out.println(min(intNumberA,intNumberB,intNumberC));

	}

	/* 3つの要素から最小値を求めるメソッド
	 * numberA:1つ目の比較要素
	 * numberB:2つ目の比較要素
	 * numberC:3つ目の比較要素
	 */
	static int min(int numberA,int numberB, int numberC){
		// 各要素を比較するため、numberA仮の最小値とする
		int min = numberA;
		// 最小値とnumberBを比較する
		if(min > numberB) {
			// 最小値よりnumberBが小さい場合、最小値にnumberBを代入する
			min = numberB;
		}
		// 最小値とnumberCを比較する
		if (min > numberC ) {
			// 最小値よりnumberCが小さい場合、最小値にnumberCを代入する
			min = numberC;
		}
		// 最小値を呼び出し元に返す
		return min;
	}

}
