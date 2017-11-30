package ensyu3;

import java.util.Scanner;

public class Ensyu3_10 {

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
		// numAとnumBでどちらが大きいか比較して差分を表示する
		System.out.println(numA > numB ? (numA - numB) : (numB - numA));
	}

}
