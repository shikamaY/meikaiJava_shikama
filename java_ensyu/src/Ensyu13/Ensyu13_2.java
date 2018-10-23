package Ensyu13;

import java.util.Scanner;

/* 演習13-2
 * 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。左下が直角、左上が直角
 * 右下が直角、右上が直角のものを追加すること
 *
 */
public class Ensyu13_2 {

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
			System.out.print(count + 1 + "番の図形の種類(1･･･点/2･･･水平直線/3･･･垂直直線/4･･･長方形/5･･･左下直角三角形/6･･･左上直角三角形/"
					+ "7･･･右下直角三角形/8･･･右上直角三角形)：");
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
				// 入力値判定
			} else if (shapeFlag == 5) {
				// 入力させるためのメッセージを表示する
				System.out.print("サイズ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 直角三角形のオブジェクトを生成
				shapeArgs[count] = new LeftDownTriangle(intLength);
			// 入力値判定
			} else if (shapeFlag == 6) {
				// 入力させるためのメッセージを表示する
				System.out.print("サイズ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 直角三角形のオブジェクトを生成
				shapeArgs[count] = new LeftUpTriangle(intLength);
			// 入力値判定
			} else if (shapeFlag == 7) {
				// 入力させるためのメッセージを表示する
				System.out.print("サイズ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 直角三角形のオブジェクトを生成
				shapeArgs[count] = new RightDownTriangle(intLength);
			// 入力値判定
			} else if (shapeFlag == 8) {
				// 入力させるためのメッセージを表示する
				System.out.print("サイズ:");
				// 入力値を変数に代入する
				int intLength = standardInput.nextInt();
				// 直角三角形のオブジェクトを生成
				shapeArgs[count] = new RightUpTriangle(intLength);
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
