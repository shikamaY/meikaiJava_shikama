package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-9
 * 要素型がint型である配列を作り、全要素を１～10の乱数で埋め尽くすプログラムを作成せよ。
 * 要素数はキーボードから読み込むこと
 */
public class Ensyu6_9 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "要素数:";

	public static void main(String[] args) {
		// ランダムな配列の要素を作るため、Randomクラスのオブジェトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 要素数を入力してもらうため、何を入力するか表示する
		System.out.print(INPUT_MESSAGE);
		// 要素数を代入
		int inputArrayCount = standardInput.nextInt();

		// ランダムな数値を入れるための、配列を用意する
		int[] array = new int[inputArrayCount];

		// 乱数の最大値を決める定数
		int randMax = 10;
		// 乱数の最小値を決める定数
		int randMin = 1;

		// ランダムな数値を各要素に入れるため、要素数分ループする
		for (int count = 0; count < inputArrayCount; count++) {
			// ランダムな値を代入する
			array[count] = rand.nextInt(randMax) + randMin;
		}

		// 全要素を表示するため、要素数分ループする
		for (int randNumber : array) {
			// 各要素を表示する
			System.out.print(randNumber + " ");
		}
	}

}
