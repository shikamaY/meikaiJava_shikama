package ensyu2;

import java.util.Scanner;

public class Ensyu2_6 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 処理の内容を表示する
		System.out.println("三角形の面積を求めます。");
		// 底辺の値を入力を促すコメント表示する
		System.out.print("底辺:");
		// 入力値をdouble型のbaseに代入する
		double base  = stdIn.nextDouble();
		// 高さの値を入力を促すコメント表示する
		System.out.print("高さ:");
		// 入力値をdouble型のheightに代入する
		double height  = stdIn.nextDouble();
		// xとyの合計値を出力する
		System.out.println("面積は" + (base * height) / 2 + "です。" );
	}

}
