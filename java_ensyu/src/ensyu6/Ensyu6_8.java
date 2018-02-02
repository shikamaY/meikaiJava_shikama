package ensyu6;

import java.util.Scanner;

/*演習6-8
 * double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 要素数と全要素の値はキーボードから読み込むこと
 */

public class Ensyu6_8 {

	// 要素数の入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "要素数:";
	// 要素の入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE_NUMBER = "要素（double型）:";

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);
		// 要素数を入力してもらうため、何を入力するか表示する
		System.out.print(INPUT_MESSAGE);
		// 要素数を代入
		int inputArrayCount = standardInput.nextInt();
		// double型の数値をを入れるため、要素数分の配列を用意する
		double numberArray[] = new double[inputArrayCount];

		// 各要素に値を入れるため、要素数の入力値分のループする
		for (int count = 0; count < inputArrayCount; count++) {
			// double型の配列に入れるため、各要素に何を入れるか促すメッセージを表示する
			System.out.print(count + 1 + INPUT_MESSAGE_NUMBER);
			// 入力値を代入
			numberArray[count] = standardInput.nextInt();
		}

		// 数値の合計値を入れる変数を用意
		double numberSum = 0;
		// numberSumに加算するために要素数分ループする
		for (double number : numberArray) {
			// 合計値に加算する
			numberSum += number;
		}
		// 合計値から平均値を計算し、変数に代入する
		double numberAverage = numberSum / (double)inputArrayCount;

		// 合計値と平均値の結果を表示する
		System.out.println("合計は" + numberSum + "です。平均は" + numberAverage + "です。" );
	}

}
