package ensyu7;

import java.util.Scanner;

/* 演習7-3
 * 三つのint型引数a,b,cの中央値を求めるメソッドmedを作成せよ
 */
public class Ensyu7_3 {

	public static void main(String[] args) {

		// ユーザ入力のため、Scannerクラスのオブジェクトを生成する
		Scanner standardInput = new Scanner(System.in);

			// ユーザに1つめの値を入力してもらうために表示する
			System.out.print("整数A：");
			// 入力値を変数に代入する
			int intNumberA = standardInput.nextInt();
			// ユーザに2つめの値を入力してもらうために表示する
			System.out.print("整数B：");
			// 入力値を変数に代入する
			int intNumberB = standardInput.nextInt();
			// ユーザに3つめの値を入力してもらうために表示する
			System.out.print("整数C：");
			// 入力値を変数に代入する
			int intNumberC = standardInput.nextInt();

		// 入力値の判定を行うため、入力値を引数にmedメソッドを実行し、結果を表示する
		System.out.println(med(intNumberA,intNumberB,intNumberC));

	}

	/* 3つの要素から中央値を求めるメソッド
	 * numberA:1つ目の比較要素
	 * numberB:2つ目の比較要素
	 * numberC:3つ目の比較要素
	 */
	static int med(int diffNumberA, int diffNumberB, int diffNumberC) {
		// 中央値を求めるため、仮の中央値を入れる
		int med = diffNumberA;
		// med（diffNumberA)がdiffNumberBより大きいかを比較する
		if(med > diffNumberB ){
			// med（diffNumberA)がdiffNumberCより大きいかつdiffNumberCがdiffNumberBより大きいかを比較する
			if( med > diffNumberC && diffNumberC > diffNumberB) {
				// diffNumberCを代入する
				med = diffNumberC;
			// diffNumberBがdiffNumberCより大きい場合
			} else  {
				med = diffNumberB;
			}
		// 	med（diffNumberA)がdiffNumberBより小さいとき
		} else {
			// diffNumberBとdiffNumberCを比較する
			if( diffNumberB < diffNumberC) {
			// numberBを代入する
			med = diffNumberB;
			// med（numberA)がnumberCより大きいかを比較する
			} else if (med < diffNumberC ){
				// numberCを代入する
				med = diffNumberC;
			}
		}
		// 中央値を呼び出し元に返す
		return med;
	}

}
