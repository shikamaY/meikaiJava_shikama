package ensyu4;

import java.util.Scanner;

/*演習4-3
 * 二つの整数値をよみこんで、ちいさいほうの数以上で大きいほうの数以下の全整数を
 * 小さいほうから順に表示するプログラムを作成せよ
 */
public class Ensyu4_3 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);


		// 整数Aを入力を促すコメント表示する
		System.out.print("整数A:");
		// 入力値を代入する
		int inputNumA  = stdIn.nextInt();
		//  整数Bを入力を促すコメント表示する
		System.out.print("整数B:");
		// 入力値を代入する
		int inputNumB  = stdIn.nextInt();

		// 最大値を入れる変数を用意
		int inputMax;
		// 最小値を入れる変数を用意
		int inputMin;
		// numBが大きいか判定する
		if (inputNumA < inputNumB) {
			// 最大値にnumBを代入する
			inputMax = inputNumB;
			// 最小値にnumAを代入する
			inputMin = inputNumA;
		// numAが大きい場合
		} else {
			// 最大値にnumAを代入する
			inputMax = inputNumA;
			// 最小値にnumBを代入する
			inputMin = inputNumB;
		}


		// 数値を表示する用の変数を用意
		int count = inputMin;
		// 最小値と最大値の間の数値を全部表示するまでループする
		do {
			// 数値を表示する
			System.out.print(count + " ");
			// countに加算
			count++;
		} while (count <= inputMax);
	}

}
