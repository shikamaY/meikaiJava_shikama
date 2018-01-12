package ensyu6;

/*演習6-2
 * 要素型がint型で要素数が5の配列の要素に対して、先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ
 */

public class Ensyu6_2 {

	public static void main(String[] args) {
		// 要素数5個の配列に値を入れるためにint型の配列を生成する
		int[] array = new int[5];
		// 配列に値を入れるために5回ループする
		for (int count = 5; count > 0; count--) {
			// 各要素に値を代入する
			array[5 - count] = count;
		}
		// 結果を表示するために要素数分ループする
		for (int number: array) {
			// 要素を表示する
			System.out.println(number);
		}
	}

}
