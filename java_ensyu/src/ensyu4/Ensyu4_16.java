package ensyu4;

import java.util.Scanner;

/*演習4-16
 * 読み込んだ個数だけ＊を表示するList4-11（p.114）をかきかえて、5個表示するごとに改行する
 * プログラムを作成せよ
 */

public class Ensyu4_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個＊を表示しますか：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++){
			System.out.print('*');
			// iが5で割れるか判定
			if(i % 5 == 0) {
				// 改行する
				System.out.println();
			}
		}
		System.out.println();
	}

}
