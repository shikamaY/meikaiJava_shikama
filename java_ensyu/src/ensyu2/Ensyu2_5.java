package ensyu2;

import java.util.Scanner;

public class Ensyu2_5 {

	public static void main(String[] args) {
		// // Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// xの値を入力を促すコメント表示する
		System.out.print("xの値:");
		// 入力値をdouble型xに代入する
		double x  = stdIn.nextDouble();
		// yの値を入力を促すコメント表示する
		System.out.print("yの値:");
		// 入力値をdouble型yに代入する
		double y  = stdIn.nextDouble();
		// xとyの合計値を出力する
		System.out.println("合計は" + (x + y) + "です。" );
		// xとyの平均値を出力する
		System.out.println("平均は" + (x + y) / 2 + "です。" );
	}

}
