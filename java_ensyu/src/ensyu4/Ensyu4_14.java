package ensyu4;

import java.util.Scanner;

/*
 * 演習4-14
 *前問題のプログラムを書き換えて式を表示するプログラムを作成せよ
 */
public class Ensyu4_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("１からnまでの和を求めます。");
		int n = 0;

		// nの値が1以上が入力されるまでループ
		for ( ; n <= 0 ; ) {
			System.out.println("nの値：");
			n = stdIn.nextInt();
		}

		int sum = 0;

		// n回ループする
		for (int i = 1; i <= n; i++ ) {
			// sumにiを加算
			sum += i;
			// iの値を表示
			System.out.print(i);
			// iがnと同じではないか比較する
			if ( i != n ) {
				// iが入力値と同じでなければ" + "を表示する
				System.out.print(" + ");
			}
		}
		// sumの値を表示する
		System.out.print(" = " + sum);
	}

}
