package Ensyu15;

/* 演習15-6
 * コマンドライン引数で与えられた半径を持つ円の長さと面積を求めて表示するプログラムを作成せよ
 *
 */
public class Ensyu15_6 {

	public static void main(String[] args) {
		// 円周率の設定
		final double pi = 3.14;
		// コマンドライン引数をint型に変換する
		Integer range = new Integer(args[0]);

		// 半径の表示
		System.out.println("半径:" + range);
		// 円周の表示
		System.out.println("円周:" + 2 * range * pi);
		// 面積の表示
		System.out.println("面積:" + range * range * pi);
	}

}
