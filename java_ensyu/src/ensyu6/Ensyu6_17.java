package ensyu6;

import java.util.Scanner;

/* 演習6-17
 * 6人の2科目（国語・数学）の点数を読み込んで、科目ごとに平均点、学生ごとに平均点を求めるプログラムを
 * 作成せよ
 *
 */

public class Ensyu6_17 {

	public static void main(String[] args) {

		// 入力するテスト科目を入れる配列を用意する
		final String testSubject[] = { "国語","数学"};
		// テストを受けた人数を入れる定数を用意する
		final int numberOfPeople = 6;

		// 各教科ごとに点数を入れるため、科目と点数を入れる二次元配列を用意する
		int[][] testScoreAll = new int[testSubject.length][];
		// 科目ごとに点数を入力するため、科目数分ループする
		for (int subjectCount = 0; subjectCount < testSubject.length; subjectCount++) {
			// 点数を入力するため、inputTestScoreメソッドの処理を科目名と人数を引数に実行して、配列に代入する
			testScoreAll[subjectCount]=inputTestScore(testSubject[subjectCount],numberOfPeople);
		}

		// 学生ごとの平均点を求めるために、個人のテストの点数の合計を入れる変数を用意する
		int[] individualScoreSum = new int[numberOfPeople];
		// 科目と学生ごとの平均点を求めるため、科目数分ループする
		for (int subjectCount=0;subjectCount<testScoreAll.length; subjectCount++){
			// 科目の合計点を入れる変数を用意する
			int testScoreSum = 0;
			// 科目と学生ごとの平均点を求めるため、人数分ループする
			for (int  peopleCount = 0; peopleCount<testScoreAll[subjectCount].length; peopleCount++) {
				// 学生ごとに点数の合計を計算する
				individualScoreSum[peopleCount] +=  testScoreAll[subjectCount][peopleCount];
				// 科目ごとにテストの合計を計算する
				testScoreSum +=  testScoreAll[subjectCount][peopleCount];
			}
			// 科目ごとの平均点を出すため、averageCalculationメソッドの処理を合計点を引数に実行する
			System.out.println(testSubject[subjectCount] + "の平均点は" + averageCalculation(testScoreSum,numberOfPeople));
		}

		// 学生ごとの平均点を計算するため、人数分ループする
		for(int peopleCount = 0; peopleCount < individualScoreSum.length; peopleCount++){
			// 各学生の平均を出すため、averageCalculationメソッドの処理を学生の合計点と科目数を引数に実行する
			System.out.println(peopleCount + 1 + "人目の平均点は" + averageCalculation(individualScoreSum[peopleCount],testSubject.length));
		}



	}

	 /* 指定した人数分のテストの点数を入力するためのメソッド
	 * testSubject:何の科目か入力時に分かるように表示するための引数
	 * elementCount:何人分の点数を入力するか指定するための引数
	*/
	static int[] inputTestScore(String testSubject , int elementCount){

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// テスト結果を入れるための配列を用意する
		int[] testScore = new int[elementCount];

		// 指定した人数分値を入力するため、人数回ループする
		for (int count = 0; count < elementCount; count++) {
			// どの要素に値を入れるかユーザに分かるように表示する
			System.out.print(count + 1 + "人目の" + testSubject + "の得点:");
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
	static int averageCalculation(int intNumber,int numberCount){
		// 平均値を呼び出し元に返す
		return intNumber / numberCount;
	}

}
