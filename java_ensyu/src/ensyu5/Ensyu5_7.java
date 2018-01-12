package ensyu5;

/*演習5-7
 * 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ
 */
public class Ensyu5_7 {

	public static void main(String[] args) {
		// float型の加算用変数を用意する
		float floatTotal = 0.0F;
		// 0.001おきに計算するため、1000回ループする
		for (int count = 0; count <= 1000; count ++) {
			// 0.001ごとに処理するためcountを1000で割る
			floatTotal = (float)count / 1000;
			// floatの値を表示する
			System.out.print(floatTotal);
			// 結果表示を見やすいようにスペースを空ける
			System.out.print("    ");
			// countを1000で割った結果を表示する
			System.out.print(floatTotal * floatTotal);
			// 改行する
			System.out.println();
		}
	}

}
