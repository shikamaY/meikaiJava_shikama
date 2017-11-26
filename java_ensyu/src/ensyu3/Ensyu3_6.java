package ensyu3;

import java.util.Scanner;

public class Ensyu3_6 {

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
		// numか10の倍数か判定する
		} else if (num % 10 == 0) {
			// 10で割り切れる場合は倍数と表示する
			System.out.println("その値は10の倍数です。");
		} else {
			// 割り切れない場合は倍数ではないと表示する
			System.out.println("その値は10の倍数ではありません。");
		}
	}

}
