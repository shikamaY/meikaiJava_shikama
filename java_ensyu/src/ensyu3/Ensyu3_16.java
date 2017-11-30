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
		// 中央値用変数
		int center;
		// 最小値用変数
		int min;
		// numAがもっとも大きいかを比較する
		if(numA > numB && numA > numC){
			// 最大値にnumAを代入する
			max = numA;
			// numBがnumCより大きいかを比較する
			if(numB > numC) {
				// centerにnumBを代入する
				center = numB;
				// minにnumCを代入する
				min = numC;
			// numCがnumBより大きい場合
			} else {
				// centerにnumBを代入する
				center = numC;
				// minにnumBを代入する
				min = numB;
			}
		// 	numBが最も大きいか比較する
		} else if(numB > numA && numB > numC) {
			// 最大値にnumBを代入する
			max = numB;
			// numAがnumCより大きいかを比較する
			if(numA > numC) {
				// centerにnumAを代入する
				center = numA;
				// minにnumCを代入する
				min = numC;
			// numCがnumAより大きい場合
			} else {
				// centerにnumCを代入する
				center = numC;
				// minにnumAを代入する
				min = numA;
			}
		} else {
			// 最大値にnumCを代入する
			max = numC;
			// numAがnumBより大きいかを比較する
			if(numA > numB) {
				// centerにnumAを代入する
				center = numA;
				// minにnumBを代入する
				min = numB;
			// numBがnumAより大きい場合
			} else {
				// centerにnumBを代入する
				center = numB;
				// minにnumAを代入する
				min = numA;
			}
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
