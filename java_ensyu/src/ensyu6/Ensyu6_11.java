package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-11
 * 異なる要素が同じ値をもつことのないように演習6-9のプログラムを改良したプログラムを作成せよ
 */
public class Ensyu6_11 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "要素数:";

	public static void main(String[] args) {
		// ランダムな配列の要素を作るため、Randomクラスのオブジェトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 要素数を入れる変数
		int inputArrayCount;
		// 入力値が正しくない場合、再度入力してもらうためにループする
		do {
			// 要素数を入力してもらうため、何を入力するか表示する
			System.out.print(INPUT_MESSAGE);
			// 要素数を代入
			inputArrayCount = standardInput.nextInt();
		// 入力値が0以下の場合は再度入力してもらう
		} while (inputArrayCount <= 0);

		// 要素数を代入
		inputArrayCount = standardInput.nextInt();

		// ランダムな数値を入れるための、配列を用意する
		int[] arrayNuber = new int[inputArrayCount];

		// 乱数の最大値を決める定数
		final int randMax = 10;
		// 乱数の最小値を決める定数
		final int randMin = 1;

		// ランダムな数値を入れるための、配列を用意する
		int arrayNumber[];

		// 入力値が乱数の最大値以上の場合に無限ループするため、入力値を判定する
		if (inputArrayCount > randMax) {
			// 乱数の最大値を要素数にする
			arrayNumber = new int[randMax];
		} else {
			// 入力値を要素数にする
			arrayNumber = new int[inputArrayCount];
		}

		// 同じ値が出ていないか判定するための一時的な乱数を入れる変数
		int randTempNumber;
		// ループ内で何番目の要素かカウントするための変数
		int count = 0;
		// すでに同じ数値が出ていた場合に乱数を再生成するため、要素数分ループする
		do {
			// 同じ値が出ているか判定した結果を入れる変数
			boolean judgementFlag = true;
			// ランダムな値を代入する
			randTempNumber = rand.nextInt(randMax) + randMin;
			// 生成された乱数がすでに出ているか確認するため、乱数を生成済みの要素数分ループする
			for (int subCount = 0; subCount < count; subCount++) {
				// 生成された乱数がすでに配列にあるか判定
				if (arrayNumber[subCount] == randTempNumber) {
					// 判定用変数をfalseにする
					judgementFlag = false;
					// 後続の要素数をチェックする必要がないため、forループを終了する
					break;
				}
			}
			// 同じ値がないか判定する
			if (judgementFlag) {
				// 配列に値を代入する
				arrayNumber[count] = randTempNumber;
				// 次の要素数の処理をするためにインクリメントする
				count++;
			}
		// カウントが配列の要数以上になった場合、ループを抜ける
		} while(count < arrayNumber.length);

		// 全要素を表示するため、要素数分ループする
		for (int randNumber : arrayNumber) {
			// 各要素を表示する
			System.out.print(randNumber + " ");
		}
	}

}
