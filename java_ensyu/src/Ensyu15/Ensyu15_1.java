package Ensyu15;

import java.util.Scanner;

/* 文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ
 *
 */

public class Ensyu15_1 {
	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("文字列:");
		// 入力値を代入する
		String stringIn = stdIn.next();

		// 文字数分ループする
		for(int stringCount = stringIn.length() -1; stringCount >= 0; stringCount--) {
			// 文字を一文字ずつ表示する
			System.out.print(stringIn.charAt(stringCount));
		}
	}
}
