package ensyu4;

import java.util.Scanner;

/*演習4-5
 * List4-5のx--がx++となっていたら、どのような出力が得られるかを検討せよ。
 * プログラムを作成して実行結果を確認すること
 */
public class Ensyu4_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.println("正の整数値");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0) {
			//System.out.println(x--);	// xの値を表示してデクリメント
			// xが0以下とならないため無限にループする
			System.out.println(x++);	// xの値を表示してインクリメント
		}
	}

}
