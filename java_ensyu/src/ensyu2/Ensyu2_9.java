package ensyu2;

import java.util.Random;

public class Ensyu2_9 {

	public static void main(String[] args) {
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// 0.0以上1.0未満の実数をを生成する
		double doubleNum = rand.nextDouble();
		// 0.0以上10.0未満の実数をを生成する
		double doubleNum10 = rand.nextInt(10) + rand.nextDouble();
		// -1.0以上1.0未満の実数を生成する
		double doubleNumPosNeg = rand.nextInt(2) - 1 + rand.nextDouble();
		// 1桁の正の数値を表示する
		System.out.println("0.0以上1.0未満の実数の値：" + doubleNum);
		// 1桁の負の数値を表示する
		System.out.println("0.0以上10.0未満の実数の値：" + doubleNum10);
		// 2桁の正の数値を表示する
		System.out.println("-1.0以上1.0未満の実数の値：" + doubleNumPosNeg);
	}

}
