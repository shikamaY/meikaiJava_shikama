package ensyu4;

import java.util.Scanner;

/*演習4-20
 * n段の正方形を表示するプログラムを作成せよ。
 */
public class Ensyu4_20 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 入力を促すメッセージを表示する
		System.out.println("何段表示するか:");
		// 入力値を変数に入れる
		int inputNum = standardInput.nextInt();

		// 入力値の回数だけ改行を行うため、inputNum回ループする
		for (int countCol = 0; countCol < inputNum; countCol++) {
			// 入力値の回数だけ*を表示するため、inputNum回ループする
			for (int countRow = 0; countRow < inputNum; countRow++) {
				// *を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}

	}

}
