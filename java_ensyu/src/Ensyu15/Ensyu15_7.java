package Ensyu15;

/* 演習15-1
 * List15-15のfor文を拡張for文で実現したプログラムを作成せよ
 */

public class Ensyu15_7 {

	public static void main(String[] args) {
		// 計算結果を入れる変数
		double sum = 0.0;
		// 引数文ループする
		for (String stringDouble : args) {
			// double型に変換して加算する
			sum += Double.parseDouble(stringDouble);
		}
		// 計算結果を表示する
		System.out.println(sum);
	}

}
