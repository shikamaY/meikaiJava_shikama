package ensyu2;

import java.util.Random;

public class Ensyu2_7 {

	public static void main(String[] args) {
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// 1桁の正の数値を生成する
		int posNum = rand.nextInt(10);
		// 1桁の負の数値を生成する
		int negNum = rand.nextInt(10) * -1;
		// 2桁の正の数値を生成する
		int posNumDouble = rand.nextInt(90) + 10;
		// 1桁の正の数値を表示する
		System.out.println("1桁の正の値：" + posNum);
		// 1桁の負の数値を表示する
		System.out.println("1桁の負の値：" + negNum);
		// 2桁の正の数値を表示する
		System.out.println("2桁の正の値：" + posNumDouble);
	}

}
