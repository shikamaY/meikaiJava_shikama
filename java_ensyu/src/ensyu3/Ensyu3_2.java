package ensyu3;

import java.util.Scanner;

public class Ensyu3_2 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 整数Aを入力を促すコメント表示する
		System.out.print("整数A:");
		// 入力値をint型のnumAに代入する
		int numA  = stdIn.nextInt();
		//  整数Bを入力を促すコメント表示する
		System.out.print("整数B:");
		// 入力値をint型のnumBに代入する
		int numB  = stdIn.nextInt();
		// numAをnumBで割り切れるか判定する
		if(numA % numB == 0) {
			// 割り切れる場合は約数と表示する
			System.out.println("BはAの約数です。");
		} else {
			// 割り切れない場合は約数ではないと表示する
			System.out.println("BはAの約数ではありません。");
		}
	}

}
