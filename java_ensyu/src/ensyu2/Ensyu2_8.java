package ensyu2;

import java.util.Random;
import java.util.Scanner;

public class Ensyu2_8 {

	public static void main(String[] args) {
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 入力を促すコメント表示する
		System.out.print("整数値:");
		// 入力値をint型numに代入する
		int num = stdIn.nextInt();
		// ±5の乱数を生成する
		int randNum = rand.nextInt(11) - 5;
		// 入力値に乱数の結果を加算した値を表示する
		System.out.println("その値の±5の乱数を生成しました。それは" + (num + randNum) + "です。");
	}

}
