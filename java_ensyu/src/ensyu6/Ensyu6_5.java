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
		// 何を入力するか表示する
		System.out.print(INPUT_MESSAGE);
		// 入力値を代入
		int inputNumber = standardInput.nextInt();
		// 入力値分の配列を用意する
		int array[] = new int[inputNumber];

		// 入力値分のループする
		for (int count = 0; count < inputNumber; count++) {
			// 各要素に何を入れるか促すメッセージを表示する
			System.out.print("a[" + count + "] = ");
			// 入力値を代入
			array[count] = standardInput.nextInt();
		}

		String result = "";
		// カンマ区切りにするため入力値 - 1回分ループする
		for (int count = 0; count < inputNumber - 1; count++) {
			// カンマを文字列の最後に足してresultに足す
			result += array[count] + ", ";
		}
		// カンマなしで配列の最終地をresultに足す
		result += array[inputNumber - 1];

		// 結果を表示する
		System.out.println("a = {" + result + "}");

		// Scannerクラスをクローズ
		standardInput.close();
	}

}
