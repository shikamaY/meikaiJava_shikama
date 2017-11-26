package ensyu3;

import java.util.Scanner;

public class Ensyu3_1 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("整数値:");
		// 入力値をint型numに代入する
		int num = stdIn.nextInt();
		// 入力値がマイナスか判別
		if(num < 0) {
			// numに-1を掛けて整数に変換
			num = num * -1;
		}
		// 絶対値を表示する。
		System.out.println("その絶対値は" + num + "です。");
	}

}
