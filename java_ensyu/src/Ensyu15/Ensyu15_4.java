package Ensyu15;

/* 演習15-4
 * 浮動小数点xを小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ
 */
public class Ensyu15_4 {

	public static void main(String[] args) {
		printDouble(10.3,5,1);
	}

	static void printDouble(double number, int decimalDigit, int digit) {
		System.out.printf(String.format("%f"),number);
	}

}
