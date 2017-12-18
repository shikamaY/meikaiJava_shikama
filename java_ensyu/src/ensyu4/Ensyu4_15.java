package ensyu4;

import java.util.Scanner;

/*演習4-15
 * 身長と標準体重の対応表を表示するプログラムを作成せよ
 * 表示する身長の範囲（開始値/終了値/増分）は整数値として読み込むこと
 * ※標準体重は（身長-100）×0.9によって求められる
 */
public class Ensyu4_15 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);

		// 開始値を入力するように表示
		System.out.println("何cmから:");
		int startHight = stdIn.nextInt();
		// 終了値を入力するように表示
		System.out.println("何cmまで:");
		int endHight = stdIn.nextInt();
		// 増加値の入力するように表示
		System.out.println("何cmごと:");
		int increaseHight = stdIn.nextInt();

		// ヘッダー行を表示する
		System.out.println("身長 標準体重");
		// 開始値から終了値までループする
		for (int Hight = startHight; Hight <= endHight; Hight += increaseHight) {
			// 身長と標準体重を表示する
			System.out.println(Hight + "  " + (Hight - 100) * 0.9 );
		}
	}

}
