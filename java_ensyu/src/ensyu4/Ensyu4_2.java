package ensyu4;

import java.util.Random;
import java.util.Scanner;

public class Ensyu4_2 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// 10～99の乱数を生成
		int num = rand.nextInt(90) + 10;


		// 何をするか表示する
		System.out.println("0～99の数字を当ててください");


		// 入力値を入れる変数を用意する
		int anser;
		do {
			// 数値の入力を促す
			System.out.print("数値を入れてください:");
			// anserに入力値を入れる
			anser = stdIn.nextInt();
			// 入力値が正解か判定する
			if (num == anser) {
				// 正解であることを表示する
				System.out.println("正解です。");
				// 正解の場合はbreakする
				break;
			}
			System.out.println("不正解です");
		} while (true);
	}

}
