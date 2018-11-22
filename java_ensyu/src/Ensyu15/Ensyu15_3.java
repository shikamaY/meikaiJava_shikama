package Ensyu15;

import java.util.Scanner;

/* 演習15-3
 * 文字列探索のプログラムを書き換えて、右のように表示するプログラムを作成せよ
 */
public class Ensyu15_3 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("文字列1:");
		// 入力値を代入する
		String stringIn1 = stdIn.next();
		// 入力を促すコメント表示する
		System.out.print("文字列2:");
		// 入力値を代入する
		String stringIn2 = stdIn.next();

		int stringSerch = stringIn1.indexOf(stringIn2);
		if (stringSerch == -1) {
			System.out.println("文字列１に文字列２は含まれていません");
		} else {
			String speace = "";
			for(int count = 0; count < stringSerch; count++) {
				speace+=" ";
			}
			System.out.println("文字列1:" + stringIn1);
			System.out.println("文字列2:" + speace + stringIn2);
		}
	}

}
