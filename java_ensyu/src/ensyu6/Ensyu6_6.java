package ensyu6;

import java.util.Scanner;

/*演習6-6
 * テストの点数の合計点・最高点・最低点を表示するプログラムを作成せよ
 * 人数と点数はキーボードから読み込むこと
 */
public class Ensyu6_6 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "人数:";
	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE_NUMBER = "番の点数:";

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);
		// 何を入力するか表示する
		System.out.print(INPUT_MESSAGE);
		// 入力値を代入
		int inputNumber = standardInput.nextInt();
		// 入力値分の配列を用意する
		int scoreArray[] = new int[inputNumber];
		// 最高点を入れる変数
		int max = 0;
		// 最低点を入れる変数
		int min = 0;

		// 入力値分のループする
		for (int count = 0; count < inputNumber; count++) {
			// 各要素に何を入れるか促すメッセージを表示する
			System.out.print(count + 1 + INPUT_MESSAGE_NUMBER);
			// 入力値を代入
			scoreArray[count] = standardInput.nextInt();
			// 最大値の仮の値を代入
			max = scoreArray[count];
			// 最小値の仮の値を代入
			min = scoreArray[count];
		}
		// 合計点を入れる変数
		int sum = 0;
		// 配列の要素分ループする
		for (int sucore : scoreArray) {
			// 合計値に加算
			sum += sucore;
			// 最大値より大きいか判定する
			if (max < sucore) {
				// 最大値に代入
				max =  sucore;
			// 最小値より小さいか判定する
			} else if (min > sucore) {
				// 最小値に代入する
				min =  sucore;
			}
		}
		// 平均値を計算
		double ave = (double)sum /(double)inputNumber;
		// 合計と平均を表示する
		System.out.println("合計点は" + sum + "です。平均点は" + ave + "です。");
		// 最高点と最低点を表示する
		System.out.println("最高点は" + max + "です。最低点は" + min + "です。");
	}

}
