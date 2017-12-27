package ensyu4;

import java.util.Scanner;

/*演習4-17
 * 読み込んだ整数値のすべての約数を表示するList4-13(p.118)を書き換えて、
 * 約数の表示がおわった後に、約数の個数を表示するプログラム
 */

public class Ensyu4_17 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すように表示する
		System.out.println("整数値：");
		// 変数に代入する
		int inputNum = standardInput.nextInt();

		// カウント用の変数
		int divisorCount = 0;
		// 入力値回ループする
		for (int count = 1; count <= inputNum; count++) {
			// 入力値が割り切れるか判定する
			if ( inputNum % count == 0) {
				// 現在の値を表示する
				System.out.println(count);
				// 約数の場合はcountをインクリメントする
				divisorCount++;
			}
		}

		// 約数の数を表示する
		System.out.println("約数は" + divisorCount + "個です");
	}

}
