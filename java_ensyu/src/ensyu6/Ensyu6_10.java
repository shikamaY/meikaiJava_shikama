package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-10
 * 連続する要素が同じ値を持つことのないように演習6-9のプログラムを改良した
 * プログラムを作成せよ
 */

public class Ensyu6_10 {

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

		// 要素数を代入
		inputArrayCount = standardInput.nextInt();

		// ランダムな数値を入れるための、配列を用意する
		int[] arrayNuber = new int[inputArrayCount];

		// 乱数の最大値を決める定数
		final int randMax = 10;
		// 乱数の最小値を決める定数
		final int randMin = 1;

		// 連続して同じ値が出ていないか判定するための一時的な乱数を入れる変数
		int randTempNumber;
		// ランダムな数値を各要素に入れるため、要素数分ループする
		for (int count = 0; count < inputArrayCount; count++) {
			// ランダムな値を代入する
			randTempNumber = rand.nextInt(randMax) + randMin;
			// 初回ループ以外で前の要素と同じ値の場合は異なる値になるまで乱数を再生成する
			while ( count != 0 && arrayNuber[count -1] == randTempNumber) {
				// ランダムな値を代入する
				randTempNumber = rand.nextInt(randMax) + randMin;
			}
			// 前の要素と同じでない場合は配列に値を代入する
			arrayNuber[count] = randTempNumber;
		}

		// 全要素を表示するため、要素数分ループする
		for (int randNumber : arrayNuber) {
			// 各要素を表示する
			System.out.print(randNumber + " ");
		}
	}

}
