package ensyu6;

import java.util.Scanner;

/* 演習6-13
 * 配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 * なお、二つの配列の要素数は同一であると仮定してよい
 */

public class Ensyu6_13 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "要素数:";
	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE_NUMBER = "arrayNumber:";


	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 要素数を入れる変数
		int inputArrayCount;
		// 入力値が正しくない場合、再度入力してもらうためにループする
		do {
			// 要素数を入力してもらうため、何を入力するか表示する
			System.out.print(INPUT_MESSAGE);
			// 要素数を代入
			inputArrayCount = standardInput.nextInt();
		// 入力値が0以下の場合は再度入力してもらう
		} while (inputArrayCount <= 0);

		// 入力値分の要素数を持つ配列を用意する
		int[] arrayNumber = new int[inputArrayCount];

		// コピー先の配列を用意する
		int[] reverseArrayNumber = new int[inputArrayCount];

		// 配列の各要素に値を入れるため、要素数分ループする
		for (int count = 0; count < inputArrayCount; count++) {
			// 要素を入力してもらうため、何を入力するか表示する
			System.out.print(INPUT_MESSAGE_NUMBER);
			// 入力値を各インデックスに代入する
			arrayNumber[count] = standardInput.nextInt();
		}

		// 配列の要素を逆順でコピーするため、配列の要素数分ループする
		for (int count = 0; count < inputArrayCount; count++) {
			// arrayNumberの後ろのインデックスの値からreverseArrayNumberのインデックスに代入していく
			reverseArrayNumber[count] = arrayNumber[inputArrayCount - count - 1];
		}

		// 全要素を表示するため、要素数分ループする
		for (int randNumber : reverseArrayNumber) {
			// 各要素を表示する
			System.out.print(randNumber + " ");
		}
	}

}
