package ensyu3;

import java.util.Scanner;

public class Ensyu3_15 {

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
		// 最大値を入れる変数を用意しnumAを代入する
		int max = numA;
		// 最小値を入れる変数を用意しnumBを代入する
		int min = numB;
		// numBがnumAより大きいか比較する
		if( numA < numB ) {
			// 作業用変数にmaxを代入する
			int t = max;
			// maxとminを入れ替える
			max = min;
			// 作業用変数の値をminに代入
			min = t;
		}
		// ソートしたとメッセージを表示する
		System.out.println("ソート結果");
		// 最大値を表示
		System.out.println(max);
		// 最小値を表示
		System.out.println(min);
	}

}
