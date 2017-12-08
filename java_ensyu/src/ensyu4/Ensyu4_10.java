package ensyu4;

import java.util.Scanner;

/*演習4-10
 * 読み込んだ値が１未満であれば改行文字を出力しないようにList4-11（p.114)を書き換えた
 * プログラムを作成せよ
 */

public class Ensyu4_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個*を表示しますか：");
		int n = stdIn.nextInt();

		// 入力値が1未満の場合は処理を行わない
		if (n < 1) {
			for (int i = 0; i < n; i++)
				System.out.print('*');
			System.out.println();
		}
	}

}
