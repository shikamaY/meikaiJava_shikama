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
		// 人数を入力してもらうため、何を入力するか表示する
		System.out.print(INPUT_MESSAGE);
		// 人数の入力値を代入
		int inputNumber = standardInput.nextInt();
		// 得点を入れるため、人数分の配列を用意する
		int testScoreArray[] = new int[inputNumber];
		// 最高点を入れる変数
		int testScoreMax = 0;
		// 最低点を入れる変数
		int testScoreMin = 0;

		// 人数の入力値分のループする
		for (int count = 0; count < inputNumber; count++) {
			// 得点の配列に入れるため、各要素に何を入れるか促すメッセージを表示する
			System.out.print(count + 1 + INPUT_MESSAGE_NUMBER);
			// 入力値を代入
			testScoreArray[count] = standardInput.nextInt();
			// 最大値の仮の値を代入
			testScoreMax = testScoreArray[count];
			// 最小値の仮の値を代入
			testScoreMin = testScoreArray[count];
		}
		// 合計点を入れる変数
		int testScoreSum = 0;
		// 合計値をと最高、最低点を計算するため人数分ループする
		for (int sucore : testScoreArray) {
			// 合計値に加算
			testScoreSum += sucore;
			// 最大値より大きいか判定する
			if (testScoreMax < sucore) {
				// 最大値に代入
				testScoreMax =  sucore;
			// 最小値より小さいか判定する
			} else if (testScoreMin > sucore) {
				// 最小値に代入する
				testScoreMin =  sucore;
			}
		}
		// 平均値を計算
		double testScoreAve = (double)testScoreSum /(double)inputNumber;
		// 合計と平均を表示する
		System.out.println("合計点は" + testScoreSum + "です。平均点は" + testScoreAve + "です。");
		// 最高点と最低点を表示する
		System.out.println("最高点は" + testScoreMax + "です。最低点は" + testScoreMin + "です。");
	}

}
