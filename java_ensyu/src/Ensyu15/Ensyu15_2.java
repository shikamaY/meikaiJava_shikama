package Ensyu15;

import java.util.Scanner;

public class Ensyu15_2 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("文字列:");
		// 入力値を代入する
		String stringIn = stdIn.next();

		// 文字数分ループする
		for(int stringCount = 0; stringCount < stringIn.length(); stringCount++) {
			// 文字を一文字と文字コードをずつ表示する
			System.out.print(stringIn.charAt(stringCount) + ":" + stringIn.codePointAt(stringCount));
			// 改行する
			System.out.println();
		}
	}
}
