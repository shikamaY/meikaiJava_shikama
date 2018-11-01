package Ensyu13;

import java.util.Scanner;

/* 図形クラス群をテストするプログラムを作成せよ。
 * List13-9と同じく、Shape型の配列を利用して、インスタンス生成と表示を行うこと
 * ただし、ここの要素数が参照するインスタンスはプログラム内で与えるのではなく、キーボードから読み込むようにすること
 *
 */

public class Ensyu13_1 {

	public static void main(String[] args) {
		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

		// 入力させるためのメッセージを表示する
		System.out.print("図形は何個:");
		// 入力値を変数に代入する
		int shapeCount = standardInput.nextInt();

		// 指定個数分の図形オブジェクトを生成
		Shape[] shapeArgs = new Shape[shapeCount];

		// 図形分ループする
		for (int count = 0; count < shapeCount; count++ ) {
			// 入力させるためのメッセージを表示する
			System.out.print(count + 1 + "番の図形の種類(1･･･点/2･･･水平直線/3･･･垂直直線/4･･･長方形)：");
			// 入力値を変数に代入する
			int shapeFlag = standardInput.nextInt();

			// 入力値判定
			if (shapeFlag == 1) {
				// 点のオブジェクトを生成する
				shapeArgs[count] = new Point();
			// 入力値判定
			} else if (shapeFlag == 2) {
				// 入力させるためのメッセージを表示する
				System.out.print("長さ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 水平直線のオブジェクトを生成
				shapeArgs[count] = new HorzLine(intLength);
			// 入力値判定
			} else if (shapeFlag == 3) {
				// 入力させるためのメッセージを表示する
				System.out.print("長さ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 垂直直線のオブジェクトを生成
				shapeArgs[count] = new VirtLine(intLength);
			// 入力値判定
			} else if (shapeFlag == 4) {
				// 入力させるためのメッセージを表示する
				System.out.print("幅:");
				// 入力値を変数に代入する
				int intWidth = standardInput.nextInt();
				// 入力させるためのメッセージを表示する
				System.out.print("高さ:");
				// 入力値を変数に代入する
				int intHeight = standardInput.nextInt();
				// 長方形のオブジェクトを生成
				shapeArgs[count] = new Rectangle(intWidth,intHeight);
			// 入力値が指定外の場合
			} else {
				// メッセージの表示
				System.out.println("指定外の入力値のため、点を生成します");
				// 入力値を変数に代入する
				shapeArgs[count] = new Point();
			}
		}

		// 図形の数分ループする
		for (Shape shapes : shapeArgs) {
			// 図形を表示する
			shapes.print();
			// 改行する
			System.out.println();
		}
	}

}
