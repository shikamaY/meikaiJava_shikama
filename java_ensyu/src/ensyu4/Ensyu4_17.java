package ensyu4;

import java.util.Scanner;

/*演習4-17
 * 読み込んだ整数値のすべての約数を表示するList4-13(p.118)を書き換えて、
 * 約数の表示がおわった後に、約数の個数を表示するプログラム
 */

public class Ensyu4_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値：");
		int inputNum = stdIn.nextInt();

		// カウント用の変数
		int count = 0;
		for (int i = 1; i <= inputNum; i++) {
			if ( inputNum % i == 0) {
				System.out.println(i);
				// 約数の場合はcountをインクリメントする
				count++;
			}
		}

		// 約数の数を表示する
		System.out.println("約数は" + count + "個です");
	}

}
