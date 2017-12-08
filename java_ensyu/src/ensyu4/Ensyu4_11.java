package ensyu4;

import java.util.Scanner;

/*演習4-11
 * 正の整数値を0までカウントダウンするList4-4（p.100)をfor文で実現せよ
 */

public class Ensyu4_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x = 0;

		// 正数が入れられるまでループ
		for (int i = 0; i < 1; ){
			System.out.println("正の整数値：");
			x = stdIn.nextInt();
			// 負数の場合はiを減らす
			if (x >= 0) {
				i++;
			}
		}

		// 0になるまでループ
		for (int i = x; i >=0; i--) {
			// iを表示する
			System.out.println(i);
		}
	}

}
