package ensyu5;

/*演習5-6
 * List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と,List5-10の
 * ように、int型で変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
 * 横に並べて表示するプログラムを作成せよ
 */
public class Ensyu5_6 {

	public static void main(String[] args) {
		// ヘッダー行の文字部分を表示する
		System.out.println("float       int");
		// ヘッダー行の区切りを表示する
		System.out.println("-----------------");
		// float型の加算用変数を用意する
		float floatTotal = 0.0F;
		// インクリメントを1000回するためにループする
		for (int count = 0; count <= 1000; count ++) {
			// floatの値を8桁で表示する
			System.out.printf("%8f",floatTotal);
			// 結果表示を見やすいようにスペースを空ける
			System.out.print("    ");
			// countを1000で割った結果を8桁で表示する
			System.out.printf("%8f",(float)count / 1000);
			// 改行する
			System.out.println();
			// floatの変数に0.001を加算する
			floatTotal += 0.001F;
		}
	}

}
