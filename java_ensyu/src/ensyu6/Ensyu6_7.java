package ensyu6;

import java.util.Random;
import java.util.Scanner;

/*演習6-7
 * List6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである
 * 最も末尾に側に位置する要素を見つけるプログラムを作成せよ
 */

public class Ensyu6_7 {

	// 入力を促すメッセージ用の定数
	public static String INPUT_MESSAGE = "探す数値:";

	public static void main(String[] args) {
		// ランダムな配列の要素を作るため、Randomクラスのオブジェトを生成する
		Random rand = new Random();
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 要素数（検証で使用する仮おきの数値のため、変更可）
		final int elementCount = 12;
		// ランダムな数値を入れるための、配列を用意する
		int[] array = new int[elementCount];

		// ランダムな数値を各要素に入れるため、要素数分ループする
		for (int count = 0; count < elementCount; count++) {
			// ランダムな値を代入する
			array[count] = rand.nextInt(10);
		}

		// 何を出力するか表示する
		System.out.print("配列arrayの全要素の値\n{");
		// 現在の配列ないの要素をすべて表示するため、要素数分ループする
		for (int number : array) {
			// 要素を表示する
			System.out.print(number + " ");
		}
		// 表示を見やすくするため、}を表示する
		System.out.println("}");

		// 検索する文字列を入力するるよう表示する
		System.out.print(INPUT_MESSAGE);
		// 検索する値を代入
		int keyNumber = standardInput.nextInt();

		// 検索用のカウント変数
		int searchCount;
		// 末尾の要素数を入れる変数。-1は一致なし
		int lastMach = -1;
		// 検索する値が存在するか判定するため、要素数分ループする
		for (searchCount = 0; searchCount < elementCount; searchCount++){
			// keyNumberと一致するか判定する
			if (array[searchCount] == keyNumber ) {
				// マッチした要素数を代入する
				lastMach = searchCount;
			}
		}
		// lastMachが0以上か判定する
		if (lastMach >= 0) {
			// 最後にマッチした要素数を表示する
			System.out.println("それはarray[" + lastMach + "]にあります。");
		// マッチしなかった場合
		} else {
			// マッチしなかったことを表示する
			System.out.println("それはありません。");
		}
	}

}
