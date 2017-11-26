package ensyu3;

import java.util.Scanner;

public class Ensyu3_7 {

	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner stdIn = new Scanner(System.in);
		// 正数を入力を促すコメント表示する
		System.out.print("正数:");
		// 入力値をint型のnumに代入する
		int num  = stdIn.nextInt();
		// 入力値が正の値か判定する
		if(num < 0) {
			// 正でないことを表示する
			System.out.println("正ではない値が入力されました。");
		// numか3で割り切れるかか判定する
		} else if (num % 3 == 0) {
			// 3で割り切れると表示する
			System.out.println("その値は3で割り切れます。");
		} else {
			// あまりがいくつか表示する
			System.out.println("その値を3で割ったあまりは" + num % 3 + "です。");
		}
	}

}
