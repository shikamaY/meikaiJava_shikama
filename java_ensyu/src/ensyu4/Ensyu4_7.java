package ensyu4;

import java.util.Scanner;

/*
 * 読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 * 表示は*と＋交互に行うこと。
 */

public class Ensyu4_7 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);

		// 数値の入力を促す
		System.out.println("何個*をひょうじしますか:");
		int inputNum = stdIn.nextInt();

		// ループ内カウント用の変数を用意する
		int count = 1;
		// countがinputNumより小さい間はループする
		while (count <= inputNum) {
			// countが奇数か判定
			if ( count % 2 == 1) {
				// *を表示する
				System.out.print('*');
			// 偶数の場合
			} else {
				// +を表示する
				System.out.print('+');
			}
			// countをインクリメント
			count++;
		}
	}

}
