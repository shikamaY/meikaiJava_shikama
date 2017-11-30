package ensyu3;

import java.util.Scanner;

public class Ensyu3_13 {

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
		//  整数Bを入力を促すコメント表示する
		System.out.print("整数C:");
		// 入力値をint型のnumCに代入する
		int numC  = stdIn.nextInt();
		// 中央値を入れる変数を用意しnumAを代入する
		int center = numA;
		// center（numA)がnumBより大きいかを比較する
		if(center > numB ){
			// center（numA)がnumCより大きいかを比較する
			if( center > numC) {
				// numCを代入する
				center = numC;
			}
		// 	center（numA)がnumBより小さいとき
		} else {
			// numBとnumCを比較する
			if( numB < numC) {
			// numBを代入する
			center = numB;
			// center（numA)がnumCより大きいかを比較する
			} else if (center < numC ){
				// numCを代入する
				center = numC;
			}
		}
		// 中央値を表示する
		System.out.println("中央値は" + center + "です。");
	}

}
