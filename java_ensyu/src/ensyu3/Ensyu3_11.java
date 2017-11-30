package ensyu3;

import java.util.Scanner;

public class Ensyu3_11 {

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
		// numAとnumBでどちらが大きいか比較して差分を取得する
		int diff = numA > numB ? (numA - numB) : (numB - numA);
		// 差分が10以下か判定する
		if(diff < 11) {
			System.out.println("されらの差は10以下です。");
		} else {
			System.out.println("されらの差は11以上です。");
		}
	}

}
