package ensyu4;

import java.util.Scanner;

/*演習4-21-右下版
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ
 */

public class Ensyu4_21b {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 何の処理を行うかを表示する
		System.out.println("右下直角の三角形を表示します");
		// 入力を促すメッセージを表示する
		System.out.println("段数は:");
		// 入力値を変数に入れる
		int inputNum = standardInput.nextInt();

		// 指定段数を表示するため、入力値分ループする
		for (int countRaw = 0; countRaw < inputNum; countRaw++) {
			// 段数と同じ数分*を右寄せで表示するため、inputNum回ループする
			for (int countCol = 0; countCol <= inputNum; countCol++) {
				if (inputNum - countRaw > countCol) {
					// 空白を表示する
					System.out.print(' ');
				} else {
					// *を表示する
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}

}
