package ensyu5;

import java.util.Scanner;

/*演習5-1
 * 10進整数をよとみこんで、その値を8進数と16進数で表示するプログラムを作成せよ
 */
public class Enasyu5_1 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		System.out.print("整数:");
		// 入力値を変数に代入する
		int inputNumber = standardInput.nextInt();
		// 入力値を8進数で表示する
		System.out.printf("8進数では%oです。\n",inputNumber);
		// 入力値を16進数で表示する
		System.out.printf("16進数では%xです。\n",inputNumber);
	}

}
