package ensyu3;

import java.util.Scanner;

public class Ensyu3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 整数Aを入力を促すコメント表示する
		System.out.print("整数A:");
		// 入力値をint型のnumAに代入する
		int numA  = stdIn.nextInt();
		//  整数Bを入力を促すコメント表示する
		System.out.print("整数B:");
		// 入力値をint型のnumBに代入する
		int numB  = stdIn.nextInt();
		//  整数Cを入力を促すコメント表示する
		System.out.print("整数C:");
		// 入力値をint型のnumCに代入する
		int numC  = stdIn.nextInt();
		// 最大値用変数
		int max;
		// maxに仮の値を入れる
		max = numA;
		// 中央値用変数
		int center;
		// centerに仮の値を入れる
		center = numB;
		// 最小値用変数
		int min;
		// minに仮の値を入れる
		min = numC;

		// 入れ替えようの変数を用意する
		int swapTmp;

		// 最大値か判定する
		if (max < center ) {
			// 入れ替えよう変数に入れる
			swapTmp = max;
			// 最大値を入れ替える
			max = center;
			// 中央値を入れ替える
			center = swapTmp;
		}
		// 最大値か判定する
		if (max < min) {
			// 入れ替えよう変数に入れる
			swapTmp = max;
			// 最大値を入れ替える
			max = min;
			// 最小値を入れ替える
			min = swapTmp;
		}

		// 中央値を判定する
		if (center < min) {
			// 入れ替えよう変数に入れる
			swapTmp = center;
			// 中央値を入れ替える
			center = min;
			// 最小値を入れ替える
			min = swapTmp;
		}
		// ソートしたとメッセージを表示する
		System.out.println("ソート結果");
		// 最大値を表示
		System.out.println(max);
		// 中央値を表示
		System.out.println(center);
		// 最小値を表示
		System.out.println(min);
	}

}
