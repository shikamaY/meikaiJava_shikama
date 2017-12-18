package ensyu4;

import java.util.Scanner;

/*演習4-6
 *読み込んだ値が1未満であれば改行文字を出力しないようにList4-7およびList4-8を書き換えたプログラムを作成せよ
 */

public class Ensyu4_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個*をひょうじしますか:");
		int n = stdIn.nextInt();

		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
		}
		// 入力値がマイナスの場合は改行しない
		if ( n < 0) {
			System.out.println();
		}
	}

}
