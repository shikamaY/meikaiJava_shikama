package Ensyu15;

/* 演習15-4
 * 浮動小数点xを小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ
 */
public class Ensyu15_4 {

	public static void main(String[] args) {
		// メソッドの実行
		printDouble(10.3,4,10);
		// メソッドの実行
		printDouble(10.3,5,1);
		// メソッドの実行
		printDouble(1,1,5);
	}

	// 指定桁数で数値を表示するメソッド
	static void printDouble(double number, int decimalDigit, int digit) {
		// 数値を表示する
		System.out.printf(String.format("%%%d.%df\n",digit,decimalDigit),number);
	}

}
