package ensyu4;

import java.util.Scanner;

/* 演習4-12
 * 前問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ。
 */

public class Ensyu4_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x = 0;

		// 正数が入れられるまでループ
		for ( ; x <= 0; ){
			System.out.println("正の整数値：");
			x = stdIn.nextInt();
		}

		// xの値になるまでループ
		for (int i = 0; i <= x; i++) {
			// iを表示する
			System.out.println(i);
		}

	}

}
