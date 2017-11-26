package ensyu2;

import java.util.Scanner;

public class Ensyu2_4 {

	public static void main(String[] args) {
		// 入力値を代入するnumをint型で宣言
		int num;
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("整数値:");
		// 入力値をint型numに代入する
		num = stdIn.nextInt();
		// 入力値に10加算した結果を表示する
		System.out.println("10を加えた値は" + (num + 10) + "です。");
		// 入力値を10減算した結果を表示する
		System.out.println("10を減じた値は" + (num - 10) + "です。");
	}

}
