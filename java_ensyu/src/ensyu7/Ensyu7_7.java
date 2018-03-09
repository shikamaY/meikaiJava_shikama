package ensyu7;

import java.util.Scanner;

/* 演習7-7
 * List7-7に示したn個の'*'を連続表示するメソッドputStrasを内部でList7-8のメソッド
 * putCharasを呼び出すことによって表示を行うように書き換えよ
 */

public class Ensyu7_7 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		System.out.println("左下直角の三角形を表示します");
		System.out.print("段数は：");
		// 入力値を変数に代入する
		int rowCount = standardInput.nextInt();

		// '*'を表示するため、ユーザが指定した段数分ループする
		for (int count = 1; count <= rowCount; count++) {
			// 表示する文字と表示する数を引数にメソッドを実行する
			putCharas('*', count);
			// 三角を表示するため改行する
			System.out.println();
		}
	}

	/* 文字を指定した数表示するメソッド
	 * displayCharacter:表示する文字
	 * displayCount:表示する数
	 */
	static void putCharas(char displayCharacter, int displayCount) {
		// 指定された数を表示するためループする
		while (displayCount-- > 0) {
			// 指定された文字を表示する
			System.out.print(displayCharacter);
		}
	}

}
