package ensyu7;

import java.util.Scanner;

/* 演習7-1
 * 受け取ったint型引数の値がnが負であれば-1を返却し、0であれば0を返却し、正であれば１を
 * 返却するメソッドsignOfを作成せよ
 */

public class Ensyu7_1 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// ユーザに値を入力してもらうために表示する
		System.out.print("整数：");
		// 入力値を変数に代入する
		int intNumber = standardInput.nextInt();

		// 入力値の判定を行うため、入力値を引数にsignOfメソッドを実行し、結果を表示する
		System.out.println(signOf(intNumber));
	}

	/* 引数の数値が正なら1、負なら-1、0なら0を返すメソッド
	 * number:判定する数値
	 */
	static int signOf(int checkNumber){
		// メソッドの返り値を入れる変数を用意する
		int returnCode = 0;
		// 引数が正か判定する
		if (checkNumber > 0) {
			// 正の場合は1を返す
			returnCode = 1;
		// 引数が負か判定する
		} else if (checkNumber < 0) {
			// 負の場合は-1を返す
			returnCode = -1;
		}
		// 0の場合は0を返す
		return returnCode;
	}

}
