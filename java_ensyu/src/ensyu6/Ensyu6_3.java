package ensyu6;

/*演習6-3
 * 要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1,2.2,3.3,4.4,5.5を
 * 代入して表示するプログラムを作成せよ
 */

public class Ensyu6_3 {

	public static void main(String[] args) {
		// 要素数5個の配列に値を入れるためにdouble型の配列を生成する
		double[] array = new double[5];
		// 配列に値を入れるために5回ループする
		for (int count = 1; count <= 5; count++) {
			// 各要素に値を代入する
			array[count - 1] = 11 * count / 10d;
		}
		// 結果を表示するために要素数分ループする
		for (double number: array) {
			// 要素を表示する
			System.out.println(number);
		}
	}

}
