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
			int intNumberC= standardInput.nextInt();

		// 入力値の判定を行うため、入力値を引数にmedメソッドを実行し、結果を表示する
		System.out.println(med(intNumberA,intNumberB,intNumberC));

	}

	/* 3つの要素から中央値を求めるメソッド
	 * numberA:1つ目の比較要素
	 * numberB:2つ目の比較要素
	 * numberC:3つ目の比較要素
	 */
	static int med(int numberA,int numberB, int numberC) {
		// 中央値を求めるため、仮の中央値を入れる
		int med = numberA;
		// med（numberA)がnumberBより大きいかを比較する
		if(med > numberB ){
			// med（numberA)がnumberCより大きいかつnumberCがnumberBより大きいかを比較する
			if( med > numberC && numberC > numberB) {
				// numberCを代入する
				med = numberC;
			// numberBがnumberCより大きい場合
			} else  {
				med = numberB;
			}
		// 	med（numberA)がnumberBより小さいとき
		} else {
			// numberBとnumberCを比較する
			if( numberB < numberC) {
			// numberBを代入する
			med = numberB;
			// med（numberA)がnumberCより大きいかを比較する
			} else if (med < numberC ){
				// numberCを代入する
				med = numberC;
			}
		}
		// 中央値を呼び出し元に返す
		return med;
	}

}
