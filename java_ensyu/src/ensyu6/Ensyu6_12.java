package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-12
 * 配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラムを作成せよ
 */


public class Ensyu6_12 {

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

		// 入力値分の要素数を持つ配列を用意する
		int[] arrayNumber = new int[inputArrayCount];

		// 配列の各要素に値を入れるため、要素数分ループする
		for (int count = 0; count < inputArrayCount; count++) {
			// 要素の並びをシャッフルした結果が分かりやすいようにcountの値を要素に入れる
			arrayNumber[count] = count+1;
		}

		// arrayNumberの各要素をランダムなインデックスに入れるため、arrayNumberと同じサイズの配列を用意する
		int[] shuffleArrayNumber = new int[inputArrayCount];
		// arrayNumberのインデックスカウント用変数
		int shuffleCount = 0;
		do {
			// ランダムな値を代入する
			int randIndex = rand.nextInt(inputArrayCount);
			// すでに値が入っているインデックスに値を入れないため、shuffleArrayNumberのインデックスに値が入っているか判定する
			if (shuffleArrayNumber[randIndex] == 0) {
				// arrayNumberの要素をshuffleArrayNumberの対象のインデックスに代入する
				shuffleArrayNumber[randIndex] = arrayNumber[shuffleCount];
				// arrayNumberのカウントに加算する
				shuffleCount++;
			}
		// arrayNumberの全要素をshuffleArrayNumberに代入し終わったらループを終了する
		} while (shuffleCount < inputArrayCount);

		// 全要素を表示するため、要素数分ループする
		for (int randNumber : shuffleArrayNumber) {
			// 各要素を表示する
			System.out.print(randNumber + " ");
		}
	}

}
