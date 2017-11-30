package ensyu3;

import java.util.Random;

public class Ensyu3_17 {

	public static void main(String[] args) {
		// Randomクラスのオブジェクトを生成
		Random rand = new Random();
		// 0～2の乱数を生成
		int num = rand.nextInt(3);
		// numの数値から条件分岐を行う
		switch (num) {
		// numが0の場合
		case 0 :
			// グーと表示する
			System.out.println("グー");
			// 分岐を抜ける
			break;
		// numが1の場合
		case 1 :
			// チョキと表示する
			System.out.println("チョキ");
			// 分岐を抜ける
			break;
		// numが2の場合
		case 2 :
			// パーと表示する
			System.out.println("パー");
			// 分岐を抜ける
			break;
		}
	}

}
