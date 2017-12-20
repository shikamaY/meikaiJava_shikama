package ensyu4;

import java.util.Scanner;

/*演習4-18
 * １からｎまでの整数値の２乗値をひょうじするプログラムを作成せよ
 */

public class Ensyu4_18 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);

		// 入力を促すメッセージを表示する
		System.out.println("ｎの値:");
		// 入力値を変数に入れる
		int inputNum = stdIn.nextInt();

		// inputNum回分ループ
		for ( int count = 1; count <= inputNum; count++){
			// countの２乗を表示する
			System.out.println(count + "の2乗は" + count * count);
		}
	}

}
