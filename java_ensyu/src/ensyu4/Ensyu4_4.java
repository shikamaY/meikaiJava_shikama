package ensyu4;

import java.util.Scanner;

/*演習4-4
 * List4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ
 */

public class Ensyu4_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.println("正の整数値");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0) {
			System.out.println(x);	// xの値を表示
			x--;				  	// xの値をデクリメント（値を１つ減らす）
		}
		// whileを抜けた後のxの値を表示する
		System.out.println("カウントダウン後の数値は" + x);
	}

}
