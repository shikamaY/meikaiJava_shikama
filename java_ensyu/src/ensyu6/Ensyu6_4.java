package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-4
 * List6-5を書きかえて、右に示すように縦向きの棒グラフで表示する
 * プログラムを作成せよ
 * 最下段には、インデックスを１０で割った余剰を表示すること
 */

public class Ensyu6_4 {

	public static void main(String[] args) {
		// 乱数を取得するため、Randomクラスのオブジェクトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 乱数の最大値
		int randMax = 10;
		// 乱数の最小値
		int randMin = 1;
		// 何を入力するか表示する
		System.out.print("要素数:");
		// 入力値を代入
		int inputNumber = standardInput.nextInt();
		// 入力値分のランダムな値を生成するための配列を用意する
		int array[] = new int[inputNumber];
		// 生成された乱数の最大値を入れる変数
		int max = 0;
		// 入力値分のループする
		for (int count = 0; count <inputNumber; count++) {
			// 各要素に乱数を入れる
			array[count] = randMin + rand.nextInt(randMax);
			// 生成された乱数が最大値か判定する
			if (max < array[count]) {
				// 最大値に代入する
				max = array[count];
			}
		}
		// *たと要数の1の位を表示するため最大値＋2回ループする
		for (int rowCount = 0; rowCount < max + 2; rowCount++) {
			// 要数分の＊と間隔をあけるために要数＊２回ループする
			for (int columnCount = 0; columnCount < inputNumber * 2; columnCount++ ) {
				// 最後から2行目か判定する
				if (rowCount == max ) {
					// 要数の1の位と*を区切る線を表示する
					System.out.print('-');
				// 間隔をあけるために偶数か判定する
				} else if (columnCount % 2 != 0) {
					// 空白を表示する
					System.out.print(' ');
				// 最終行か判定する
				} else if (rowCount == max + 1) {
					// 最終行に要数の1の位を表示する
					System.out.print(columnCount / 2 % 10);
				// *をつけない部分には空白を表示するため乱数の最大値からその要素数を引いた数値以上か判定
				} else if (max - (array[columnCount / 2]) > rowCount ) {
					// 空白を表示する
					System.out.print(' ');
				// それ以外は＊を表示する
				} else {
					// ＊を表示する
					System.out.print('*');
				}
			}
		// 改行する
		System.out.println();
		}
		// Scannerクラスをクローズ
		standardInput.close();
	}

}
