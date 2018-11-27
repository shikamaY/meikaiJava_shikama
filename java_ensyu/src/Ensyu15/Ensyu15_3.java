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
		// 文字が含まれているか判定
		int stringSerch = stringIn1.indexOf(stringIn2);
		// 結果が-1の場合
		if (stringSerch == -1) {
			// メッセージを表示する
			System.out.println("文字列１に文字列２は含まれていません");
		// 含まれている場合
		} else {
			// スペース用の変数
			String speace = "";
			// 一致した位置分ループする
			for(int count = 0; count < stringSerch; count++) {
				// スペースを追加
				speace+=" ";
			}
			// 結果の表示
			System.out.println("文字列1:" + stringIn1);
			// 結果の表示
			System.out.println("文字列2:" + speace + stringIn2);
		}
	}

}
