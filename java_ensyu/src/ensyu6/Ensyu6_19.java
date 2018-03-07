package ensyu6;

import java.util.Scanner;

/* 演習6-19
 * クラス数・各クラスの人数・全員の点数を読み込んで点数の合計点と
 * 平均点を求めるプログラムを作成せよ。合計点と平均点は、クラスごとのものと全体のものを表示すること。
 */

public class Ensyu6_19 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// クラス数を入力させるためのメッセージを表示する
		System.out.print("クラス数：");
		// クラス数を決めるため、入力値を変数に代入する
		int classNumber = standardInput.nextInt();
		// テスト結果を入れる配列を用意する
		int[][] testResult = new int[classNumber][];

		for ( int classCount = 0; classCount < testResult.length; classCount++){
			// クラス数を入力させるためのメッセージを表示する
			System.out.print("人数：");
			// クラス数を決めるため、入力値を変数に代入する
			int studentCount = standardInput.nextInt();
			// クラスの一人ひとりの点数を入力するため、inputTestScoreメソッドにクラス数、人数を引数に実行する
			testResult[classCount] = inputTestScore(classCount,studentCount);
		}

		// 全体の合計を入れる変数を用意する
		int allSum = 0;
		// 全体の平均点を入れる変数を用意する
		double avarageSum = 0;

		// 結果を見やすくするための表示
		System.out.println(" 組 |  合計  平均");
		// 結果を見やすくするための表示
		System.out.println("----+-----------------");

		// 各クラスの合計点と平均点を表示するため、クラス数分ループする
		for ( int classCount = 0; classCount < testResult.length; classCount++) {
			// クラスごとの合計点を求めて変数に代入する
			int testResultSum = intArraySum(testResult[classCount]);
			// クラスごとの平均点を求めるため、合計点と人数から平均点を求める
			double classAvarege = averageCalculation(testResultSum,testResult[classCount].length);
			// クラスの合計点、平均点を表示する
			System.out.printf(classCount + 1 + "組 | %5d %5.1f\n",testResultSum,classAvarege);
			// 全体の合計点にクラスの合計点を加算する
			allSum += testResultSum;
			// 全体の平均点にクラスの平均点を加算する
			avarageSum += classAvarege;
		}

		// 全体の合計点から平均点を計算する
		double averageAverage = averageCalculation(avarageSum,testResult.length);
		// 表示を見やすくするために表示する
		System.out.println("----+-----------------");
		// 全体の合計点と平均点を表示する
		System.out.printf(" 計 | %5d %5.1f\n",allSum,averageAverage);

	}

	 /* 各クラスの指定した人数分のテストの点数を入力するためのメソッド
	 * classCount:何組の得点を入力するかを表示するための引数
	 * elementCount:何人分の点数を入力するか指定するための引数
	*/
	static int[] inputTestScore(int classCount , int elementCount){

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// テスト結果を入れるための配列を用意する
		int[] testScore = new int[elementCount];

		// 指定した人数分値を入力するため、人数回ループする
		for (int count = 0; count < elementCount; count++) {
			// どの要素に値を入れるかユーザに分かるように表示する
			System.out.print((classCount + 1) + "組" + (count + 1) + "番の点数:");
			// 入力された値を各要素に代入する
			testScore[count] = standardInput.nextInt();
		}

		// 人数分のテスト結果を呼び出し元に返す
		return testScore;
	}

	/* 数値の平均を求めるメソッド
	 * intNumber:平均を求めるための元の数値
	 * numberCount:平均を求めるための割る数
	 */
	static double averageCalculation(double intNumber,int numberCount){
		// 平均値を呼び出し元に返す
		return intNumber / numberCount;
	}

	/* int型の配列にある全要素の合計を計算するメソッド
	 * intArray:計算するint型の配列
	 */
	static int intArraySum(int[] intArray) {
		// 数値の合計を入れる変数を用意する
		int sum = 0;

		// 全要素を加算するため配列の要素数分ループする
		for (int number : intArray) {
			// 各要素を加算する
			sum += number;
		}

		// 全要素の合計を呼び出し元に返す
		return sum;
	}
}
