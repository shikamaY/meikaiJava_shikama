package ensyu7;

import java.util.Scanner;

/* 演習7-4
 * 1からnまでの全整数の和を求めて返却するメソッドを作成せよ
 */
public class Ensyu7_4 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

			// ユーザに1つめの値を入力してもらうために表示する
			System.out.print("整数：");
			// 入力値を変数に代入する
			int intNumber = standardInput.nextInt();
			// sumUpメソッドに入力値を渡して合計結果を出力する
			System.out.println(sumUp(intNumber));
	}

	/* 1から引数の数値までの総和を求めるメソッド
	 * number:いくつまで加算するかを決める引数
	 */
	static int sumUp(int number) {
		// 合計値を入れる変数を用意する
		int sum = 0;

		// 1からnumberまでの総和を求めるため、numberの数値分ループする
		for(int count=1; count <= number; count++) {
			// 合計値に加算する
			sum += count;
		}
		// 合計値を呼び出し元に返す
		return sum;
	}

}
