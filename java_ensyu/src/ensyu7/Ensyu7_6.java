package ensyu7;

import java.util.Scanner;

/* 演習7-6
 * 引数ｍで指定された月の季節を表示するメソッドprintSeasonを表示せよ。mが3,4,5であれば春
 * 6,7,8であれば夏、9,10,11であれば秋、12,1,2であれば冬と表示し、それ以外の値であれば何も表示しないこと
 */

public class Ensyu7_6 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

			// ユーザに何月か値を入力してもらうために表示する
			System.out.print("何月：");
			// 入力値を変数に代入する
			int monthNumber = standardInput.nextInt();
			// 入力値が何の季節に紐づくか判定するため、メソッドを実行する
			printSeason(monthNumber);
	}

	/* 引数の数値がどの季節に紐づくか判定して表示する
	 * monthNumber:何月かの引数
	 */
	static void printSeason(int monthNumber) {
		// 引数が3～5か判定する
		if(monthNumber >= 3 && monthNumber <= 5) {
			// 春と出力する
			System.out.println("春");
		// 引数が6～8か判定する
		} else if(monthNumber >= 6 && monthNumber <= 8) {
			// 夏と出力する
			System.out.println("夏");
		// 引数が9～11か判定する
		} else if(monthNumber >= 9  && monthNumber <= 11) {
			// 秋と出力する
			System.out.println("秋");
		// 引数が12か1か2か判定する
		} else if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
			// 冬と出力する
			System.out.println("冬");
		}
	}

}
