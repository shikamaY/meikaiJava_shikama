package ensyu4;

import java.util.Scanner;

/*
 * 季節を求めるList4-1（p.95）の月の読み込みにおいて、1～12以外の値が入力された
 * 場合は、再入力させるようにしゅうせいしたプログラムを作成せよ（do文の中にdo分が入る二重ループとなる）
 */
public class Ensyu4_19 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// リトライ判定用の変数
		int retry;
		// 入力された月を入れる変数
		int month;

		// リトライするためのループ
		do {
			// 入力値が不正の場合、再度入力を促すためにループする
			do {
				// 入力を促すメッセージを表示
				System.out.print("季節を求めます。\n何月ですか：");
				// 入力値を代入する
				month=standardInput.nextInt();
			// 入力値が1～12であるかチェックする
			} while (month <= 0 || month >= 13);
			// 入力値が3以上5以下の場合
			if (month >= 3 && month <= 5 ) {
				// 結果を表示する
				System.out.println("それは春です。");
			// 入力値が6以上8以下の場合
			} else if (month >= 6 && month <= 8) {
				// 結果を表示する
				System.out.println("それは夏です。");
			// 入力値が9以上11以下の場合
			} else if (month >= 9 && month <= 11) {
				// 結果を表示する
				System.out.println("それは秋です。");
				// 入力値が12または1,2の場合
			} else if (month == 12 || month == 1 || month == 2) {
				// 結果を表示する
				System.out.println("それは冬です。");
			}

			// リトライするか確認するメッセージを表示する
			System.out.print("もう一度？1・・・Yes/0・・・No：");
			// 入力値を代入する
			retry = standardInput.nextInt();
		// 1の場合はループする
		} while (retry == 1);

	}

}
