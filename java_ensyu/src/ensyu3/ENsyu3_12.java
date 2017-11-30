package ensyu3;

import java.util.Scanner;

public class ENsyu3_12 {

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
		// 最大値を入れる変数を用意しnumAを代入する
		int min = numA;
		// max（numA)とnumBを比較する
		if(min > numB){
			// numBを代入
			min = numB;
		} else if(min > numC){
			// numCを代入
			min = numC;
		}
		// 最小値を表示する
		System.out.println("最小値は" + min + "です。");
	}

}
