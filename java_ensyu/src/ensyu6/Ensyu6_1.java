package ensyu6;

/*演習6-1
 * 要素数がdouble型で要素数が5の配列を生成して、その全要数の値を表示するプログラムを作成せよ
 */
public class Ensyu6_1 {

	public static void main(String[] args) {
		// 要数5個の配列の中身を表示するためにdouble型の配列を生成する
		double[] doubleArray = {1,2,3,4,5};
		// 配列の中身を表示するため、要素数5個分ループする
		for (double number : doubleArray) {
			// 要素を表示する
			System.out.println(number);
		}
	}

}
