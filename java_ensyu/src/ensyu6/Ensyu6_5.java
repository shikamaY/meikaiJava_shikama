package ensyu6;

import java.util.Scanner;

/*演習6-5
 * 配列の要素数とここの要素の値を読み込んで書くようその値を表示するプログラムを作成せよ
 * 表示の形式は初期化子と同じ形式、すなわち各要素の値をコンマで区切って｛｝で囲んだ値とすること
 */



public class Ensyu6_5 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "要素数:";

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);
		// 要数を決めるための入力をするように表示する
		System.out.print(INPUT_MESSAGE);
		// 要数の入力値を代入
		int inputNumber = standardInput.nextInt();
		// 入力値の要数分の配列を用意する
		int array[] = new int[inputNumber];

		// 要数の入力値分のループする
		for (int count = 0; count < inputNumber; count++) {
			// 配列に値を入れるために各要素に入力を促すメッセージを表示する
			System.out.print("array[" + count + "] = ");
			// 各要素の入力値を代入
			array[count] = standardInput.nextInt();
		}
		// 文字列を結合した結果を入れる変数
		String arrayBondResult = "";
		// カンマ区切りにするため入力値 - 1回分ループする
		for (int count = 0; count < inputNumber - 1; count++) {
			// カンマを文字列の最後に足してresultに足す
			arrayBondResult += array[count] + ", ";
		}
		// カンマなしで配列の最終地をresultに足す
		arrayBondResult += array[inputNumber - 1];

		// 文字列を結合した結果を表示する
		System.out.println("array = {" + arrayBondResult + "}");

		// Scannerクラスをクローズ
		standardInput.close();
	}

}
