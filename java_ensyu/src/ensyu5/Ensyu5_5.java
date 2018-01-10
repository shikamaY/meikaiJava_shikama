package ensyu5;

import java.util.Scanner;

/*演習5-4
 * 蜜の整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 平均はキャスト演算子を利用して求め、実数とて表示すること
 */

public class Ensyu5_5 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 何を行う処理か表示する
		System.out.println("3つの値を読み込んで合計と平均を表示します。");
		// 1めの値を入力するように表示する
		System.out.print("整数値1つめ:");
		// 入力値を変数に代入する
		int inputNumber1 = standardInput.nextInt();
		// 2めの値を入力するように表示する
		System.out.print("整数値2つめ:");
		// 入力値を変数に代入する
		int inputNumber2 = standardInput.nextInt();
		// 3めの値を入力するように表示する
		System.out.print("整数値3つめ:");
		// 入力値を変数に代入する
		int inputNumber3 = standardInput.nextInt();

		// 合計を計算する
		int total = inputNumber1 + inputNumber2 + inputNumber3;
		// 実数値で平均を計算する
		double average = (double) (total) / 3;

		// 合計の計算結果を表示する
		System.out.println("合計は" + total + "です。");
		// 平均の計算結果を表示する
		System.out.println("平均は" + average + "です。");
	}

}
