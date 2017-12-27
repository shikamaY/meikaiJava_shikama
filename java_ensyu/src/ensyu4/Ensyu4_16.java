package ensyu4;

import java.util.Scanner;

/*演習4-16
 * 読み込んだ個数だけ＊を表示するList4-11（p.114）をかきかえて、5個表示するごとに改行する
 * プログラムを作成せよ
 */

public class Ensyu4_16 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すように表示する
		System.out.println("何個＊を表示しますか：");
		// 入力値を変数に入れる
		int inputNum = standardInput.nextInt();

		// 入力値分ループする
		for (int count = 1; count <= inputNum; count++){
			// *を表示する
			System.out.print('*');
			// iが5で割れるか判定
			if(count % 5 == 0) {
				// 改行する
				System.out.println();
			}
		}
		// 改行する
		System.out.println();
	}

}
