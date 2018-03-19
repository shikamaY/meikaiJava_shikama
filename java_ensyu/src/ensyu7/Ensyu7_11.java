package ensyu7;

import java.util.Scanner;

/* 演習7-11
 * 整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラムを作成せよ
 */

public class Ensyu7_11 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// シフトする数を決める定数
		final int shiftNumber = 1;
		// シフトした数値と比較する際に計算するための数値
		final int multiplicationNumber = 2;
		// 何を入力するかユーザに分かるように表示する
		System.out.print("整数:");
		// ユーザからの入力値を代入する
		int intNumber = standardInput.nextInt();

		// 表示する数値がユーザに何か分かるように表示する
		System.out.println("整数" + intNumber + "のビット表示");
		// 指定した値のビットの表示を行う
		printBits(intNumber);
		// 表示を見やすくするための改行
		System.out.println();
		// 表示する数値がユーザに何か分かるように表示する
		System.out.println("整数" + intNumber + "を左にシフトしたビット表示");
		// 指定した値を左にシフトした値を表示する
		printBits(intNumber << shiftNumber);
		// 表示を見やすくするための改行
		System.out.println();
		// 表示する数値がユーザに何か分かるように表示する
		System.out.println("整数" + intNumber + "を2の1乗した値(" + (intNumber * 2) + ")のビット表示");
		// 指定した値が2の１乗と左にシフトした値で同じ数値になるか分かるようにするために計算して表示する
		printBits(intMultiplication(intNumber,shiftNumber,multiplicationNumber));
		// 表示を見やすくするための改行
		System.out.println();
		// 表示する数値がユーザに何か分かるように表示する
		System.out.println("整数" + intNumber + "を右にシフトしたビット表示");
		// 指定した値を右にシフトした値を表示する
		printBits(intNumber >> shiftNumber);
		// 表示を見やすくするための改行
		System.out.println();
		// 表示する数値がユーザに何か分かるように表示する
		System.out.println("整数" + intNumber + "を2分の1した値(" + (intNumber / 2) + ")のビット表示");
		// 指定した値が2分の１と右にシフトした値で同じ数値になるか分かるようにするために計算して表示する
		printBits(intDivision(intNumber,shiftNumber,multiplicationNumber));

	}

	/* 指定した値をビットで表示するメソッド
	 * intNumber:ビット表示する整数値
	 */
	static void printBits(int intNumber) {
		// 32桁分ループする
		for (int count = 31; count >= 0; count--) {
			// countのビット数が1か判定して1か0を表示する
			System.out.print(((intNumber >>> count & 1) == 1) ? '1' : '0');
		}
	}

	/* 指定した整数値にmultiplicationNumberのmultiplicationCount乗を掛けた値を計算するメソッド
	 * intNumber:計算する元の値
	 * multiplicationCount:何乗するか指定する値
	 * multiplicationNumber:何の乗数か指定する値
	 */
	static int intMultiplication(int intNumber, int multiplicationCount ,int multiplicationNumber) {
		// 0乗の場合の最低値
		int multiplicationResult = 1;
		// 指定した乗数分ループする
		for (int count = 0; count < multiplicationCount; count ++) {
			// multiplicationNumberをループ回分掛けた結果を代入する
			multiplicationResult *= multiplicationNumber;
		}
		// 指定した値とmultiplicationNumberのべき乗をかけた結果を返却する
		return intNumber * multiplicationResult;
	}

	/* 指定した整数にmultiplicationNumberのdivisionCountを割った値を計算するメソッド
	 * intNumber:計算する元の値
	 * divisionCount:何乗するか指定する値
	 * multiplicationNumber:何の乗数か指定する値
	 */
	static int intDivision(int intNumber, int divisionCount ,int multiplicationNumber) {
		// 0乗の場合の最低値
		int divisionResult = 1;
		// 指定した乗数分ループする
		for (int count = 0; count < divisionCount; count ++) {
			// multiplicationNumberをループ回分掛けた結果を代入する
			divisionResult *= multiplicationNumber;
		}
		// 指定した値とmultiplicationNumberのべき乗をかけた結果を返却する
		return intNumber / divisionResult;
	}

}
