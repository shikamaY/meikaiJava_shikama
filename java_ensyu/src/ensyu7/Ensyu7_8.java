package ensyu7;

import java.util.Random;
import java.util.Scanner;

/* 演習7-8
 * a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ。
 * なお、bの値がaより小さい場合には、aの値をそのまま返却すること
 *
 */

public class Ensyu7_8 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 最小値を指定してもらうために表示する
		System.out.print("最小値：");
		// 入力値を変数に代入する
		int minNumber = standardInput.nextInt();
		// 最大値を指定してもらうために表示する
		System.out.print("最大値：");
		// 入力値を変数に代入する
		int maxNumber = standardInput.nextInt();

		// 最小値と最大値から乱数を生成し、表示する
		System.out.println(random(minNumber,maxNumber));
	}

	/* 指定された最小値と最大値から乱数を返却するメソッド
	 * 最大値より最小値が多い場合は乱数を生成せずに最小値を返却する
	 * minNumber:最小値
	 * maxNumber:最大値
	 */
	static int random(int minNumber,int maxNumber) {
		// 乱数を生成するため、Randomクラスのオブジェクトを生成する
		Random rand = new Random();
		// 返却する値を入れる変数
		int resultNumber;

		// 最小値が最大値より大きいか判定する
		if (minNumber > maxNumber) {
			// 最小値が最大値より大きい場合は最小値をそのまま返却用変数に代入する
			resultNumber = minNumber;
		// 最小値が最大値より小さい場合
		} else {
			// 引数から乱数を生成し、変数に代入する
			resultNumber = minNumber + rand.nextInt(maxNumber);
		}

		// 処理結果を返却する
		return resultNumber;
	}

}
